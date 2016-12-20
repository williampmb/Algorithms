/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author William
 */
public class StringPermutation {

    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
    
    
    public static List<String> permutation1(String word){
        if(word.equals("")) return null;
        List<String> words = new ArrayList<String>();
        List<String> tmp;
        
        words.add(""+word.charAt(0));
        
        for(int i =1;i<word.length();i++){
            tmp = new ArrayList<String>();
            for(String w: words){
                tmp.addAll(permutation1(word.charAt(i), w));
            }
            words = tmp;
        }
        return words;
    }

    private static Collection<? extends String> permutation1(char toPlace, String word) {
        if(word.length() == 0) return null;
        List<String> words = new ArrayList<String>();
        String prefix,sufix;
        for(int i =0; i<= word.length();i++){
            prefix = word.substring(0, i);
            sufix = word.substring(i);
            words.add( prefix + toPlace + sufix);
        }
        
        return words;
    }
}
