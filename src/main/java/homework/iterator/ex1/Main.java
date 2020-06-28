package homework.iterator.ex1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.service();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
