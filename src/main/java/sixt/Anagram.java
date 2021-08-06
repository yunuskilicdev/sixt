package sixt;

import java.util.Locale;

public class Anagram {

    static final int CHARS_NUMBER = 256;
    static final int SPACE_ASCII = 32;

    public static boolean isAnagram(String s, String t) {
        if (s.length() == 0 || t.length() == 0){
            return false;
        }
        s = s.toLowerCase(Locale.ENGLISH);
        t = t.toLowerCase(Locale.ENGLISH);

        int[] firstFreq = new int[CHARS_NUMBER];
        int[] secondFreq = new int[CHARS_NUMBER];
        for (int i = 0; i < s.length(); i++) {
            firstFreq[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++){
            secondFreq[t.charAt(i)]++;
        }

        for (int i = 0; i < CHARS_NUMBER; i++) {
            if (firstFreq[i] != secondFreq[i] && i != SPACE_ASCII) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramLite(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] firstFreq = new int[CHARS_NUMBER];
        int[] secondFreq = new int[CHARS_NUMBER];
        for (int i = 0; i < s.length(); i++){
            firstFreq[s.charAt(i)]++;
            secondFreq[t.charAt(i)]++;
        }

        for (int i = 0; i < CHARS_NUMBER; i++){
            if (firstFreq[i] != secondFreq[i]){
                return false;
            }
        }
        return true;
    }
}
