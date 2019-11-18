package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        Boolean answer = false;
        for (int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray.length; j++){
                if (inputArray[i] * inputArray[i] == squaredValues[j]) {answer = true;}
            }
            if (answer == false) {return answer;}
            answer = false;
        }
        return true;
    }
}
