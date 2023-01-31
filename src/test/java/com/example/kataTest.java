package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kataTest {

    @Test
    @DisplayName("An empty string should return 0")
    void anEmptyStringShouldReturn0(){
        int sum = kata.add("");

        assertEquals(0,sum);

    }
    @Test
    @DisplayName("Two numbers saperated with comma should return sum")
    void twoNumbersSaperatedWithCommaShouldReturnSum(){
        int sum = kata.add("0,0");

        assertEquals(0, sum);
    }
    @Test
    @DisplayName("Unknown amount of numbers")
    void unknownAmountOfNumbersShouldReturnSum() {
        int sum = kata.unknownAmount("3,9,6,7");
        assertEquals(25,sum);
    }
    }
