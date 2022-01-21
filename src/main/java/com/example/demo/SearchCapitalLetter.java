
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 
 * This application contains possible soultions for 
 * 
 * Given an array of strings, find the string(s) that have at least one capital letter in it.
 * 
 */
public class SearchCapitalLetter {
    
    private static final String REGEX = ".*[A-Z].*";

    private SearchCapitalLetter(){}

    /**
     * This method iterate over every characters in the String and check whether the ASCII value is in between 65(A) and 90(B)
     * @param input
     * @return
     */
    public static List<String> findStringCaptialLetterIterativeApproach(String[] input){

        List<String> result = new ArrayList<>();

        if(input == null) return result;

        for(String str:input){
            if(containsCapital(str)){
                result.add(str);
            }
        }
        return result;
    }

    public static boolean containsCapital(String str){
        if(str == null) return false;
        for(int i=0,size=str.length();i<size;i++){
            int ch = str.charAt(i);
            if(ch>='A' && ch<='Z') return true;
        }
        return false;
    }

    /**
     * This method uses Regex to find the capital letters in given Strings
     * 
     * @param input
     * @return
     */
    public static List<String> findStringCaptialLetterUsingRegex(String[] input){
        List<String> result = new ArrayList<>();
        if(input == null) return result;
        for(String str:input){
            if(str!=null && Pattern.matches(REGEX, str)){
                result.add(str);
            }
        }
        return result;
    }
}
