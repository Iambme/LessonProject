package homework.io.ex3;

import java.io.*;

public class Service {
    public static void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = "src\\homework\\io\\PWFile.txt";
        String path2 = "src\\homework\\io\\file.txt";
        PrintWriter pw = new PrintWriter(path);
        BufferedWriter bw = new BufferedWriter(pw);
//        FileReader fr = new FileReader(path2);
//        BufferedReader br = new BufferedReader(fr);


        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Записать в файл строку через PrintWriter");
            System.out.println("2.Записать в файл строку через BufferedWriter");
            System.out.println("3.Считать из файла строку через FileReader");
            System.out.println("4.Считать из файла строку через BufferedReader");
            System.out.println("5.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    System.out.println("Введите строку для записи");
                    String userString = reader.readLine();
                    MyWriter writer = filepath -> pw.println(userString);
                    MyReaderWriterService.startWrite(writer, path);
                }
                break;
                case 2: {
                    System.out.println("Введите строку для записи");
                    String userString = reader.readLine();
                    MyWriter writer = filepath -> {
                        try {
                            bw.write(userString);
                            bw.newLine();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    };
                    MyReaderWriterService.startWrite(writer, path);
                }
                break;
                case 3: {
                    FileReader fr = new FileReader(path2);

                    MyReader reader1 = filepath -> {
                        try {
                            char[] buffer = new char[1000];
                            while (fr.read() != (-1)) {
                                fr.read(buffer);
                                System.out.println(buffer);

                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    };
                    MyReaderWriterService.startRead(reader1, path2);
                    fr.close();
                }
                break;

                case 4: {
                    FileReader fr = new FileReader(path2);
                    BufferedReader br = new BufferedReader(fr);
                    MyReader reader1 = filepath -> {
                        try {
                            String str = br.readLine();
                            while (str != null) {
                                System.out.println(str);
                                str = br.readLine();
                            }


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    };
                    MyReaderWriterService.startRead(reader1, path2);
                    br.close();
                    fr.close();
                }
                break;

                case 5:
                    isOver = true;
                    break;
            }
        }
        bw.close();
        pw.close();

    }
}
