package practice;

import java.util.Scanner;

public class ArrayTest2 {

    public static void main(String[] args) {

        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < words.length; i++) {
            char[] question = words[i].toCharArray();
            char tmp;
            int j = 0;
            for (int k=0; k < question.length; k++) {
                j = (int) (Math.random() * question.length);
                tmp = question[k];
                question[k] = question[j];
                question[j] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i + 1, new String(question));

            String answer = scanner.nextLine();

            if (words[i].equals(answer.trim())) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다.%n%n");
            }
        }
    }
}
