package rocks.zipcode.io.quiz3.fundamentals;

import java.sql.Array;
import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split("\\W+");
        System.out.println(String.join(" ", words));
        for(int i = 0; i < words.length; i++) {
            if (VowelUtils.hasVowels(words[i])) {
                if (VowelUtils.startsWithVowel(words[i])) {
                     words[i] = words[i] + "way";
                }
                else {
                    String prefix = words[i].substring(VowelUtils.getIndexOfFirstVowel(words[i]));
                    String suffix = words[i].substring(0, VowelUtils.getIndexOfFirstVowel(words[i]));
                    words[i] = prefix + suffix + "ay";
                }
            }
            else {words[i] = words[i] + "ay";}
        }
        return String.join(" ", words);
    }
}
