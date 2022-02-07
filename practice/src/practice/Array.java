package practice;

public class Array {

    public static void main(String[] args) {
        int[] score = {1, 2, 3, 4, 5};
        for (int i=0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        String[] sArr;
        sArr = new String[5];
        for (int i=0; i < sArr.length; i++) {
            sArr[i] = Integer.toString(i) + score[i];
            System.out.println(sArr[i]);
        }
    }
}

