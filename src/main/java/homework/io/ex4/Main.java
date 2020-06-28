package homework.io.ex4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
