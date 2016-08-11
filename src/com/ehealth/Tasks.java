package com.ehealth;

import java.util.*;

/**
 * Created by Samuel on 8/10/2016.
 */
public class Tasks {
    /**
     * The Compact function is responsible for running the compact array code
     *
     * @param arr
     */
    public static void compact(int[] arr) {
        int size = arr.length;
        ArrayList err = new ArrayList();

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
     * @param nums
     * @param k
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
     * The Reverse function serves as utility for the rotate
     * function to separate the action of reversing the data in the specified array
     *
     * @param nums
     * @param start
     * @param end
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
     * @param string1
     * @param string2
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
     * @param string1
     * @param string2
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

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    public static int lcm(int[] a, int n) {
        int res = 1, i;
        for (i = 0; i < n; i++) {
            res = res*a[i]/gcd(res, a[i]);
        }
        return res;
    }
}

