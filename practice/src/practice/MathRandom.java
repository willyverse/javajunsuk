package practice;

public class MathRandom {

    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);

        double d = 5.99;
        System.out.println((int) d);
        d = 5.4;
        System.out.println((int) d);
        }
    }
}
