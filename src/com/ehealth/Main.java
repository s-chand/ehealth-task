package com.ehealth;


public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {1, 1, 1, 3, 7, 7, 8, 9, 9, 9, 10, 11, 11, 11, 12, 12, 13, 14, 14, 14};
        int[] array2={1, 2, 3, 4, 5, 6};
        Tasks.compact(array);
        Tasks.rotate(array2,2);
        //Tasks.find_chars_N("Joseph","phineJos");
        Tasks.find_chars_NN("BabaForThe Girls","FatherOftheGirls");
        Tasks.find_chars_N("BabaForThe Girls","FatherOftheGirls");
        System.out.print(Tasks.lcm(array2,array2.length));
    }

}
