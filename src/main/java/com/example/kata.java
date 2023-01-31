package com.example;

import java.util.Objects;

public class kata {

    public static int add(String numbers)
    {
        String[] detailed = numbers.split(",");

        if(Objects.equals(numbers, ""))
            return 0;

        int number1 = Integer.parseInt(detailed [0]);
        int number2 = Integer.parseInt(detailed [1]);
            return number1+number2;

    }
    public static int unknownAmount(String numbers){

        String[] detailed = numbers.split(",");
        int sum = 0;
        for (int i = 0; i < detailed.length; i++) {
            sum = sum + Integer.parseInt(detailed[i]);
        } return sum ;
    }
    }

