package com.mypack;
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for(int i = 0; i<numbers.length; i++) {
            for(int x = 0; x<numbers.length; x++) {
                // System.out.println("i=" + i + " x=" +x);
                if(numbers[i] + numbers[x] == target && i!=x) {
                    arr[0] = i;
                    arr[1] = x;
                    return arr;
                }
            }
        }
        return arr;
    }
}
