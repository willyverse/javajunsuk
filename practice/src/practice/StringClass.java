package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringClass {

    public String str = "ABCDE";
    private int len = str.length();
    int length = "ABCDE".length();
    boolean a = "ABCDE".equals(str);
    int b;

    int getLen() {
        return this.len;
    }

    public void show() {
        System.out.println(str);
    }

    public static void main(String[] args) {

        StringClass stringClass = new StringClass();
        System.out.println(stringClass.str + stringClass.getLen());

        Integer[] a = {1, 2, 3};
        Integer[] b = {1, 2, 3};
        System.out.println(Arrays.deepToString(b));
    }
}
