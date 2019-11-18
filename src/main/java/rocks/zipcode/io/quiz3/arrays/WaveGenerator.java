package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] waves = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            waves[i] = str.toLowerCase();
            if (Character.isLetter(waves[i].charAt(i))) {
                waves[i] = StringUtils.capitalizeNthCharacter(waves[i], i);
            }
            if (i > countLetters(str)) {break;}
        }
        System.out.println(waves.toString());
        return waves;
    }

    public static Integer countLetters(String str) {
        Integer count = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i))){count++;}
        }
        return count;
    }
}