package oop1;

import java.util.Arrays;

public class Ex20 {
    
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        } else {
            return Arrays.stream(arr).max().getAsInt();
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println(max(data));
        System.out.println(max(null));
        System.out.println(max(new int[] {}));
    }
}
