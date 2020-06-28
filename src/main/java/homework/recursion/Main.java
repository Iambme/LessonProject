package homework.recursion;

public class Main {
    public static void main(String[] args) {
        String string = "example string";
        String string1 = "example string";
        String string2 = "example strind";
        printString(string, 2);
        equalsString(string, string1, 0);
        equalsString(string,string2,0);

        System.out.println(equalsBooleanString(string,string1,0));
        System.out.println(equalsBooleanString(string,string2,0));
    }

    public static void printString(String str, int index) {
        if (str.length() > index) {
            System.out.println(str.charAt(index));
            printString(str, index + 2);

        }
    }

    public static void equalsString(String str, String str1, int index) {
        if (str.length() == str1.length()) {
            if (str.length() - 1 == index) {
                if (str.charAt(index) == str1.charAt(index)) {
                    System.out.println("Строки равны");
                }
            }
            if (str.length() > index) {
                if (str.charAt(index) == str1.charAt(index)) {
                    equalsString(str, str1, index + 1);
                } else {
                    System.out.println("Строки не равны");
                }
            }
        } else {
            System.out.println("Строки не равны");
        }

    }

    public static boolean equalsBooleanString(String str, String str1, int index) {
        if (str.length() != str1.length()) {
            return false;
        }
        if(str.length()>index) {
            if (str.charAt(index) == str1.charAt(index)) {
                return equalsBooleanString(str, str1, index + 1);
            }else{
                return false;
            }
        }

        return true;
    }

}
