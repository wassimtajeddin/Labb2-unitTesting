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
}
