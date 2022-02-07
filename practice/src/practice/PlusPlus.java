package practice;

public class PlusPlus {

    public static void main(String[] args) {
        int i = 5, j = 0;
        i++;
        j = i++;
        System.out.println(j);
        j = ++i;
        System.out.println(j);

        long f = 1234;
        System.out.println(f);

        String a = "a";
        a = new String("b");
        System.out.println(a);
    }
}
