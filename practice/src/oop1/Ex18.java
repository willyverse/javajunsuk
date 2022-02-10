package oop1;

public class Ex18 {

    public static boolean isNumber(String str) {
        if ( str==null || str.equals("") ) {
            return false;
        }

        for(int i=0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) throws Exception {
        String str = "123";
        System.out.println(str + "는 숫자? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자? " + isNumber(str));
    }
}
