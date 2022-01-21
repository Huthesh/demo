package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.SearchCapitalLetter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * Unit test for simple App.
 */
public class SearchCapitalLetterTest {
  
    @ParameterizedTest
    @ValueSource(strings = {"aB","AA","A1234A","XYZ"})
    public void containsCapitalCase1(String input){
        boolean containsCapital = SearchCapitalLetter.containsCapital(input);
        assertTrue(containsCapital);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa","abcz","a1324325z","xyz","","   "})
    public void containsCapitalCase10(String input){
        boolean containsCapital = SearchCapitalLetter.containsCapital(input);
        assertFalse(containsCapital);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void containsCapitalCase3(String input){
        boolean containsCapital = SearchCapitalLetter.containsCapital(input);
        assertFalse(containsCapital);
    }


    @Test
    public void containsCapital(){
        String[] input = {"aa","AA",null,"24234"," ","", "ccAyz","tyuZ"};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterIterativeApproach(input);
        assertEquals(Arrays.asList("AA","ccAyz","tyuZ"), result);
    }

    @Test
    public void containsCapitalCase2(){
        String[] input = {};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterIterativeApproach(input);
        assertEquals(new ArrayList<>(), result);
    }


    @Test
    public void containsCapital3(){
        String[] input = {"aa","z","a","b","c","-"};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterIterativeApproach(input);
        assertEquals(new ArrayList<>(), result);
    }


    @Test
    public void containsCapital4(){
        String[] input = {null,null};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterIterativeApproach(input);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void containsCapital5(){
        String[] input = {"aa","AA",null,"24234"," ","", "ccAyz","tyuZ"};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterUsingRegex(input);
        assertEquals(Arrays.asList("AA","ccAyz","tyuZ"), result);
    }

    @Test
    public void containsCapitalCase5(){
        String[] input = {};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterUsingRegex(input);
        assertEquals(new ArrayList<>(), result);
    }


    @Test
    public void containsCapital6(){
        String[] input = {"aa","z","a","b","c","-","$","."};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterUsingRegex(input);
        assertEquals(new ArrayList<>(), result);
    }


    @Test
    public void containsCapital7(){
        String[] input = {null,null};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterUsingRegex(input);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void containsCapital8(){
        String[] input = {".","*","#","A%$#.*"};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterUsingRegex(input);
        assertEquals(Arrays.asList("A%$#.*"), result);
    }

    @Test
    public void containsCapital9(){
        String[] input = {".","*","#","A%$#.*"};
        List<String> result = SearchCapitalLetter.findStringCaptialLetterIterativeApproach(input);
        assertEquals(Arrays.asList("A%$#.*"), result);
    }
}
