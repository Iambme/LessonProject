package homework.concurrency.ex8;

import java.io.*;

public class Main {
    static volatile int i = 1;

    public static void main(String[] args) throws IOException {
        /*
        5. В директории лежат входные текстовые файлы (необходимо их создать, не менее 5),
        проименованные следующим образом: in_<N>.dat, где N - натуральное число.
        Каждый файл состоит из двух строк. В первой строке - число, обозначающее действие,
         а во второй - числа с плавающей точкой, разделенные пробелом.
Действия могут быть следующими:
1 - сложение
2 - умножение
3 - сумма квадратов
Необходимо написать многопоточное приложение,
которое выполнит требуемые действия над числами и сумму результатов запишет в файл out.dat
         */
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\main\\java\\homework\\concurrency\\ex8\\out.dat", true)));


        Runnable task = ()-> {

                try {

                    String opration = "";
                    String digits = "";
                    String path = "";
                    while (i < 6) {
                        BufferedReader bufferedReader =null;
                        synchronized (Main.class) {
                            if (i < 6) {
                                path = "src\\main\\java\\homework\\concurrency\\ex8\\in_" + i + ".dat";
                                i++;
                                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
                            }
                        }
                        opration = "";
                        digits = "";

                        if(bufferedReader!=null) {
                            opration = bufferedReader.readLine();
                            digits = bufferedReader.readLine();
                        }
                        if(bufferedReader!=null) {
                            synchronized (bufferedWriter) {
                                bufferedWriter.write(path + " " + result(opration, digits) + "\n");
                                bufferedWriter.flush();
                            }
                        }

                        Thread.sleep(5);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();


//        Thread thread = new Thread(() -> {
//            try {
//                BufferedReader bufferedReader =null;
//                String opration = "";
//                String digits = "";
//                String path = "";
//                while (i < 6) {
//
//
//
//                    synchronized (Main.class) {
//
//                        if (i < 6) {
//                            path = "src\\main\\java\\homework\\concurrency\\ex8\\in_" + i + ".dat";
//                            i++;
//                            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//                        }
//                    }
//                    opration = "";
//                    digits = "";
//
//                    while (bufferedReader!=null && bufferedReader.ready()) {
//                        opration = bufferedReader.readLine();
//                        digits = bufferedReader.readLine();
//                    }
//                    synchronized (bufferedWriter) {
//                        bufferedWriter.write(path + " " + result(opration, digits) + "\n");
//                        bufferedWriter.flush();
//                    }
//
//
//
//                    Thread.sleep(5);
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        });
//        Thread thread1 = new Thread(() -> {
//            try {
//                BufferedReader bufferedReader;
//                String opration = "";
//                String digits = "";
//                String path = "";
//                while (i < 6) {
//                    synchronized (Main.class) {
//                        path = "src\\main\\java\\homework\\concurrency\\ex8\\in_" + i + ".dat";
//                        i++;
//                    }
//                    if (i < 6) {
//                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//                        opration = "";
//                        digits = "";
//                        while (bufferedReader.ready()) {
//                            opration = bufferedReader.readLine();
//                            digits = bufferedReader.readLine();
//                        }
//                        synchronized (bufferedWriter) {
//                            bufferedWriter.write(path + " " + result(opration, digits) + "\n");
//                            bufferedWriter.flush();
//                        }
//                        Thread.sleep(5);
//                    }
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            try {
//                BufferedReader bufferedReader;
//                String opration = "";
//                String digits = "";
//                String path = "";
//                while (i < 6) {
//                    synchronized (Main.class) {
//                        path = "src\\main\\java\\homework\\concurrency\\ex8\\in_" + i + ".dat";
//                        i++;
//                    }
//                    if (i < 6) {
//                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//                        opration = "";
//                        digits = "";
//                        while (bufferedReader.ready()) {
//                            opration = bufferedReader.readLine();
//                            digits = bufferedReader.readLine();
//                        }
//                        synchronized (bufferedWriter) {
//                            bufferedWriter.write(path + " " + result(opration, digits) + "\n");
//                            bufferedWriter.flush();
//                        }
//                        Thread.sleep(5);
//                    }
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        thread.start();
//        thread1.start();
//        thread2.start();


    }

    public static double result(String operation, String digits) throws Exception {
        String[] doubles = digits.split(" ");
        if(!doubles[0].isEmpty()) {
            double one = Double.parseDouble(doubles[0]);
            double two = Double.parseDouble(doubles[1]);
            switch (operation) {
                case "1":
                    return one + two;
                case "2":
                    return one * two;
                case "3":
                    return (one * one) + (two * two);


            }
        }
        System.out.println(operation);
        System.out.println(doubles[0]);
        System.out.println(doubles[1]);

        throw new Exception("Something wrong");
    }


}
