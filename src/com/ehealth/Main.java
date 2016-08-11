package com.ehealth;


public class Main {

    public static void main(String[] args) {
        // The following are sample data to aid in testing the logic in the Tasks Class
        int[] array = {1, 1, 1, 3, 7, 7, 8, 9, 9, 9, 10, 11, 11, 11, 12, 12, 13, 14, 14, 14};
        int[] array2={1, 2, 3, 4, 5, 6};
        Tasks.compact(array); // Question 3
        Tasks.rotate(array2,2); // Question 4
        //Tasks.find_chars_N("Joseph","phineJos");
        Tasks.find_chars_NN("Josephine","Jonathan"); //Question 2
        Tasks.find_chars_N("Josephine","Jonathan"); //Question 2
        System.out.print(Tasks.lcm(array2,array2.length)); // Question 5
    }

}
