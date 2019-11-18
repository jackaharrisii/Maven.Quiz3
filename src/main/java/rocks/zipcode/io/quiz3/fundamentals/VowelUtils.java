package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        if (word.toUpperCase().contains("A")
                || word.toUpperCase().contains("E")
                || word.toUpperCase().contains("I")
                || word.toUpperCase().contains("O")
                || word.toUpperCase().contains("U")) {
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer indexOfVowel;
        for (indexOfVowel = 0; indexOfVowel < word.length(); indexOfVowel++){
            if (hasVowels(word.substring(indexOfVowel,indexOfVowel+1))) {break;}
        }
        if (indexOfVowel == word.length() && !hasVowels(word.substring(word.length()-1))) {return -1;}
        return indexOfVowel;
    }


    public static Boolean startsWithVowel(String word) {
        if (hasVowels(word.substring(0,1))) { return true;}
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (hasVowels(character.toString())) { return true;}
        return false;
    }
}
