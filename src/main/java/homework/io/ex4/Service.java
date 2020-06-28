package homework.io.ex4;

import homework.io.ex3.MyReader;
import homework.io.ex3.MyReaderWriterService;
import homework.io.ex3.MyWriter;

import java.io.*;

public class Service {
    public static void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = "src\\homework\\io\\PWFile.txt";
        String path2 = "src\\homework\\io\\file.txt";
        PrintWriter pw = new PrintWriter(path);
        BufferedWriter bw = new BufferedWriter(pw);
        FileWriter fw = new FileWriter(path);
        BufferedWriter bwf = new BufferedWriter(fw);
        FileOutputStream fos = new FileOutputStream(path);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        OutputStreamWriter osw1 = new OutputStreamWriter(System.out);
        BufferedWriter bw1 = new BufferedWriter(osw1);


        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Записать текст, считанный с консоли через PrintWriter");
            System.out.println("2.Запись текст, считанный с консоли, в файл через FileWriter");
            System.out.println("3.Считать тест из файла через FileReader");
            System.out.println("4.Запись текст, считанный с консоли, в файл через FileOutputStream");
            System.out.println("5.Считать тест из файла через FileInputStream");
            System.out.println("6.Считать текст с консоли через System.in");
            System.out.println("7.Вывести текст на консоль через System.out");
            System.out.println("8.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    System.out.println("Введите строку для записи");
                    String userString = reader.readLine();
                    bw.write(userString);
                    bw.flush();
                }
                break;
                case 2: {
                    System.out.println("Введите строку для записи");
                    String userString = reader.readLine();
                    bwf.write(userString);
                    bwf.flush();
                }
                break;
                case 3: {
                    FileReader fr = new FileReader(path2);
                    BufferedReader br = new BufferedReader(fr);
                    try {
                        String str = br.readLine();
                        while (str != null) {
                            System.out.println(str);
                            str = br.readLine();
                        }


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    br.close();
                    fr.close();
                }
                break;

                case 4: {
                    System.out.println("Введите строку для записи");
                    String userString = reader.readLine();
                    osw.write(userString);
                    osw.flush();
                }
                break;

                case 5: {
                    FileInputStream fis = new FileInputStream(path2);
                    InputStreamReader isr = new InputStreamReader(fis);
//                   BufferedReader reader1 = new BufferedReader(isr);
//                   String line = reader1.readLine();
//                   while (line!=null){
//                       System.out.println(line);
//                       line = reader1.readLine();
//                   }
//                    reader1.close();
                    int i;

                    while ((i = isr.read()) != -1) {

                        System.out.print((char) i);
                    }

                    isr.close();
                    fis.close();
                }
                break;
                case 6: {
                    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                    String string = reader1.readLine();
                    System.out.println(string);

                }
                break;
                case 7: {
                    String str = "Text";
                    bw1.write(str);
                    bw1.flush();


                }
                break;
                case 8:
                    isOver = true;
                    break;
            }
        }
        bw.close();
        pw.close();
        bwf.close();
        fw.close();
        osw.close();
        fos.close();
        bw1.close();
        osw1.close();
        reader.close();
    }
}
