package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(indexToCapitalize, Character.toUpperCase(sb.charAt(indexToCapitalize)));
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        StringBuilder sb = new StringBuilder(baseString);
        if (sb.charAt(indexOfString) == characterToCheckFor) {return true;}
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        // start with the full loop from the first letter
        // then return only unique subsequent substrings in alphabetized order
        // finally, join the sorted subsequent strings to the end of the first array
        String[] prefix = getPrefixArray(string);
        ArrayList<String> suffix = getSuffixArrayList(string);
        sortAndRemoveDuplicates(suffix);
        String[] imFinished = joinArraytoArrayList(prefix, suffix);
        return imFinished;
    }

    public static Integer getNumberOfSubStrings(String input){
        // NOTE - counts number of unique substrings, not all substrings
        // these are different numbers if any letters are used more than once within the string
        return getAllSubStrings(input).length;
    }

    private static String[] getPrefixArray(String string) {
        String[] prefix = new String[string.length()];
        for (int i = 0; i < string.length(); i++){
            prefix[i] = string.substring(0, i+1);
        }
        return prefix;
    }

    private static ArrayList<String> getSuffixArrayList(String string) {
        ArrayList<String> suffix = new ArrayList<>();
        for(int i = 1; i < string.length(); i++){
            for (int j = i; j < string.length(); j++){
                suffix.add(string.substring(i, j+1));
            }
        }
        return suffix;
    }

    private static void sortAndRemoveDuplicates(ArrayList<String> suffix) {
        Set<String> suffixV2 = new TreeSet<>(suffix);
        suffix.clear();
        suffix.addAll(suffixV2);
    }

    private static String[] joinArraytoArrayList(String[] prefix, ArrayList<String> suffix) {
        String[] imFinished = new String[prefix.length + suffix.size()];
        for (int i = 0; i < prefix.length; i++){
            imFinished[i] = prefix[i];
        }
        int k = 0;
        for (int j = prefix.length; j < imFinished.length; j++){
            imFinished[j] = suffix.get(k);
            k++;
        }
        return imFinished;
    }

}
