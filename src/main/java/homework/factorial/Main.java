package homework.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число, для которого необходимо вычислить факториал");

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        try {

            System.out.println(factorial(input));
        }
        catch (InvalidFactorialValueException e){
            e.printStackTrace();
        }
    }

    public static String factorial(int n) throws InvalidFactorialValueException {
        /* add your code here */
        BigDecimal big =  BigDecimal.ONE;

        if (n< 0){
            throw new InvalidFactorialValueException("У введённого числа факториал не может быть вычислен");
        }
        else if (n ==0){
            return "1";
        }
        else {
            for (int i = 2; i <= n ; i++) {
                big =  big.multiply(new BigDecimal(String.valueOf(i)));
            }

            return String.valueOf(big);
        }

    }


}