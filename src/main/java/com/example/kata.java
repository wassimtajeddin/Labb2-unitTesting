package com.example;

import java.util.Objects;

public class kata {

    public static int add(String numbers)
    {
        if(Objects.equals(numbers, ""))
            return 0;
        String[] detailed = numbers.split(",");
        int number1 = Integer.parseInt(detailed [0]);
        int number2 = Integer.parseInt(detailed [1]);
            return number1+number2;
    }
    }

