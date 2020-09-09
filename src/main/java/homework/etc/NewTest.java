package homework.etc;

import java.util.*;
import java.util.function.UnaryOperator;

public class NewTest {
    public static void main(String[] args) {
        System.out.println(squareDigits("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int squareDigits(String n) {
        String[] strings = n.split("");
        int min = strings[0].length();
        for (int i = 0; i <strings.length ; i++) {
            if(min<strings[i].length()){
                min=strings[i].length();
            }
        }
        return min;
    }


}


