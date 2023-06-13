package org.example.practice;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class DailyProblems{

    //swaps first and last name within a string
    public static String nameSwap(String fullName) {
        final String firstName = fullName.substring(0, fullName.indexOf(" "));
        final String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        return lastName + ", " + firstName;
    }

    //convert minutes into seconds
    public static int minuteToSeconds(int minutes) { return minutes * 60; }

    //use the given operator on two numbers
    public static int operate(int num1, int num2, @NotNull String operator) {
        if (operator.equals("+")) { return num1 + num2; }
        if (operator.equals("-")) { return num1 - num2; }
        if (operator.equals("*")) { return num1 * num2; }
        if (operator.equals("/")) { return num1 / num2; }
        if (operator.equals("%")) { return num1 % num2; }
        return num1;
    }

    //returns the word count of a sentence
//    public static int wordCount(@NotNull String sentence) {
//        int count = 0;
//        while (count < sentence.length()) {
//            if (sentence.split(" ", 0)) {
//                count++;
//            };
//        }
//        return count;
//    }

    //takes a name and returns a String greeting
    public static String helloName(String name) { return "Hello " + name + "!"; }

    //basic calculator
    public static int basicCalculator(int num1, String operator, int num2) {
        if (operator.equals("+")) { return num1 + num2; }
        if (operator.equals("-")) { return num1 - num2; }
        if (operator.equals("/")) { return num1 / num2; }
        if (operator.equals("*")) { return num1 * num2; }
        return num1;
    }

    //calculate the total sum of an array
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    //finding the pivot index in an array; where the left and right indices equals each other and the num in the middle is the pivot
    public static int pivotIndex(int[] nums) {

    }
}
