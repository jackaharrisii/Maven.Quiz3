package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() {
        this(null);
        this.labs = new ArrayList<Lab>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs){
            if (lab.getName().equals(labName)) { return lab; }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (labs.contains(getLab(labName))) { getLab(labName).setStatus(labStatus);}
        else throw new UnsupportedOperationException();
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString(){
        String output = "";
        for (int i = labs.size()-1; i > 0; i--){
            output += labs.get(i).getName() + " > " + labs.get(i).getStatus() + "\n";
        }
        output += labs.get(0).getName() + " > " + labs.get(0).getStatus();
        return output;
    }

}
