package homework.serializable;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        try {
            Service s = new Service();
            s.go();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
