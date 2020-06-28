package lesson.exceptions.CalculatorWithExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //Написать калькулятор на 2 действия: + /
        //Написать метод проверки числа на валидность, который может выбрасывать следующие исключения:
        //Если пользователь вводит символ вместо числа, выбрасывать NotDigitException
        //Если пользователь при делении вводит 0, выбрасывать ArithmeticException

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String a = null;
        String b = null;
        int a1 = 0;
        int b1 = 0;
        boolean incorrectInput = true;

        do {
            System.out.println("Введите первое число");
            a = reader.readLine();
            try {
                a1 = checkInteger(a);
                incorrectInput = false;
            } catch (NotDigitException e) {
                e.printStackTrace();
            }
        }
        while (incorrectInput);

        incorrectInput = true;

        do {
            System.out.println("Введите второе число");
            b = reader.readLine();
            try {
                b1 = checkInteger(b);
                incorrectInput = false;
            } catch (NotDigitException e) {
                e.printStackTrace();
            }
        }
        while (incorrectInput);
        incorrectInput = true;


        String action = null;

        do {
            System.out.println("Введите действие: (+ / )");
            action = reader.readLine();
            try {
                isInvalidAction(action);
                incorrectInput = false;
            } catch (InvalidActionException e) {
                e.printStackTrace();
            }
            if (action.equals("+")) {
                System.out.println(plus(a1, b1));
            } else if (action.equals("/")) {
                try {
                    isDivideByZero(b1);
                    System.out.println(divide(a1, b1));
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        }
        while (incorrectInput);
    }


    public static int checkInteger(String val) throws NotDigitException {

        if (val.matches("\\d+")) {
            return Integer.parseInt(val);
        }
        throw new NotDigitException(val + " Не является числом");

    }

    public static boolean isDivideByZero(int val) {
        if (val == 0) {
            throw new ArithmeticException("Обнаружено деление на ноль");

        }
        return false;
    }

    public static boolean isInvalidAction(String actionValue) throws InvalidActionException {
        if (!(actionValue.equals("+") || actionValue.equals("/"))) {
            throw new InvalidActionException("Введено неверное действие");
        }
        return true;
    }

    public static double divide(int a, double b) {
        return a / b;
    }

    public static int plus(int a, int b) {
        return a + b;
    }
}
