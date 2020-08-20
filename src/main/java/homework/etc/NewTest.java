package homework.etc;

import java.util.*;
import java.util.function.UnaryOperator;

public class NewTest {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(Math.pow(9, 2));
    }

    public static int squareDigits(int n) {
        String digit = String.valueOf(n);
        StringBuilder digitString = new StringBuilder();
        int a;
        for (int i = 0; i < digit.length(); i++) {
            System.out.println(digit.charAt(i));
            a =  Integer.parseInt(digit.charAt(i)+"") * Integer.parseInt(digit.charAt(i)+"");
            digitString.append(a);
        }
        System.out.println(digitString);
        return Integer.parseInt(digitString.toString());
    }


}


