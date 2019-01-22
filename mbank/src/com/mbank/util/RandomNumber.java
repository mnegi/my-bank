package com.mbank.util;

import java.util.Random;

public class RandomNumber {
    public static int nextInt(){
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(1000);
        return randomNumber;
    }
}
