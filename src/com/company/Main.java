package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int a = Integer.parseInt("123");
        //double b = Double.parseDouble("143.5");
        //System.out.println(String.valueOf(a) + " " + " " +10.2);
        //System.out.println(a + 10);
        //System.out.println(b + 33);
        //System.out.println(" Drug  100 ml ".trim().split(" ")[2]);
        // System.out.println(Integer.toString(262));
        // System.out.println(Integer.toBinaryString(262));
        //System.out.println(Integer.toHexString(262));
        //System.out.println(Integer.toOctalString(262));
        //int [] arr = new int[4];
        //arr[arr.length - 1] = 100;
        //System.out.println(Arrays.toString(arr));
        //int [] [] arr = {{1,2,3}, {4,5,6}};
        // int [] [] arr1 = new int [4] [];
        // arr1[0] = new int [2];
        //arr1[1] = new int [3];
        //arr1[2] = new int [4];
        //arr1[3] = new int [5];
        //arr1 [1] [1] = 1000;
        // arr1 [2] [3] = 1000;
        //System.out.println(Arrays.deepToString(arr1));
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.binarySearch(arr, 6));
        //SystemOut(arr);


        //reversArray(arr);
        for (int bar = arr.length - 1; bar >= 0; bar--) {
            for (int index = 0; index < bar; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];

                    arr[index + 1] = temp;
                }

            }
        }


    }
}