package com.ehealth;

import java.util.*;

/**
 * Created by Samuel on 8/10/2016.
 *
 * Please note that validation in this code has been limited based on the fact that it has been tailored to test specification
 */
public class Tasks {
    /**
     * The Compact function is responsible for running the compact array code
     * Solution to Question 3
     *
     * @param arr function parameter
     *
     */
    public static void compact(int[] arr) {
        int size = arr.length;
        ArrayList<Integer> err = new ArrayList<>();

        if (size > 0) {
            err.add(arr[0]);
            // compactedArray[0] = arr[0]; //Store the first entry to ease iteration process
            for (int i = 1; i < size; i++) {

                if (arr[i - 1] != arr[i]) {
                    //compactedArray[i] = arr[i];
                    err.add(arr[i]);
                }
            }
            //return compactedArray;
        } else {
            System.out.println("Insufficient data. Data set must be greater than 0");

        }
        System.out.println(err.toString());
    }

    /**
     * The Rotate function is responsible for calling the
     * reverse function and also prints out the result
     *
     * Solution to Question 4
     *
     * @param nums parameter 1 for rotate function
     * @param k parameter 2 for rotate function
     */
    public static void rotate(int[] nums, int k) { // k = 2
        k %= nums.length;
        // {0,1,2,3,4}

        reverse(nums, 0, nums.length - 1); // Reverse the whole Array
        // {4,3,2,1,0}

        reverse(nums, 0, k - 1); // Reverse first part (4,3 -> 3,4)
        // {3,4,2,1,0}

        reverse(nums, k, nums.length - 1); //Reverse second part (2,1,0 -> 0,1,2)
        // {3,4,0,1,2}
        System.out.println(Arrays.toString(nums));

    }

    /**
     * The Reverse function serves as utility for the Rotate
     * function for Question 4 to separate the action of reversing the data in the specified array
     *
     * @param nums first parameter for reverse function representing the input array of integers
     * @param start second parameter for reverse function representing the starting point for rotation
     * @param end third parameter for reverse function representing the end point got rotation
     */
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Find_Chars_NN is a method that executes the find chars question using an order N * N approach
     * The two loops each represent an O(n) operation making it an O(N*N)
     *
     * Solution to Question 2: Part 1
     *
     * @param string1 first parameter for find_chars_NN function
     * @param string2 second parameter for find_chars_NN function
     */
    public static void find_chars_NN(String string1, String string2) {
        String result = "";

        char[] s1 = string1.toCharArray();
        char[] s2 = string2.toCharArray();
        for (char c : s1) {
            for (char d : s2) {
                if (c == d) {
                    result += c;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    /**
     * The find_chars_N methods attempts to solve the problem using an order of N i.e O(N)
     *
     * Solution to Question 2: Part 2
     *
     * @param string1 first parameter for find_chars_N function
     * @param string2 second parameter for find_chars_N function
     */

    public static void find_chars_N(String string1, String string2) {
        String result = "";

        char[] str1 = string1.toCharArray();

        for (char c : str1) {
            if (string2.contains(String.valueOf(c))) {
                result += c;
            }
        }
        System.out.println(result);
    }


    /**
     *
     * Solution to Question 5
     *
     *
     * The LCM function
     * This function accepts two parameters, an integer array and a number n that is the length of the array.
     * This was included so as to enable me reuse the function.
     * During declaration, please include the array size.
     * @param a first parameter for LCM function representing the input array
     * @param n second parameter for LCM function. Stands for the size of the input array to process
     * @return integer
     */
    public static int lcm(int[] a, int n) {

        int res = 1, i;
        for (i = 0; i < n; i++) {
            res = res*a[i]/gcd(res, a[i]);
        }
        return res;
    }

    /**
     * Supporting function for Question 5
     *
     *
     * The GCD function serves as a utility function for the LCM.
     * It computes the Greatest Common Divisor of two numbers.
     * These numbers are supplied in succession by the LCM function from the input array
     * @param a first parameter
     * @param b second paramter
     * @return integer
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}

