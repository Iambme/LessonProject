package homework.io.ex2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = "src\\homework\\io\\ex1\\file.txt";

        FileWriter fileWriter = null;
        boolean isOver = false;
        try {
            fileWriter = new FileWriter(path,true);
            String userInput = "";
            while (!isOver) {
                userInput = reader.readLine();
                if (!userInput.equals("exit")) {
                    fileWriter.write(userInput);
                }
                else {
                    isOver = true;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
