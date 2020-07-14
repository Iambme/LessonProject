package homework.date.ex1;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        PresidentDataBase presidentDataBase = new PresidentDataBase();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String regex = "([0-9]{2})\\.([0-9]{2})\\.([0-9]{4})";


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = "src\\main\\java\\homework\\data\\presidents";
        Path path = Paths.get(path1);//nio
        FileReader fileReader = new FileReader(String.valueOf(path));
        FileWriter fileWriter = new FileWriter(String.valueOf(path), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String name;
        Date dateFirst;
        Date dateLast;
        String party;

        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            arrayList.add(bufferedReader.readLine());
        }


        for (String s : arrayList) {
            String[] fields = s.split("; ");
            name = fields[0];
            dateFirst = sdf.parse(fields[1]);
            sdf.format(dateFirst);
            dateLast = sdf.parse(fields[2]);
            sdf.format(dateLast);
            party = fields[3];
            presidentDataBase.addPres(new President(name, dateFirst, dateLast, party));

        }
        System.out.println(presidentDataBase.toString());


        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1. Вывести имена президентов и сроки их правления в порядке возрастания столбца ");
            System.out.println("2.Вывести имена президентов и сроки их правления в обратном порядке");
            System.out.println("3.Найти президента, который правил в определенную дату");
            System.out.println("4.Добавить нового президента");
            System.out.println("5.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    Comparator<President> upToDate = new Comparator<President>() {
                        @Override
                        public int compare(President o1, President o2) {
                            return o1.getDateFirst().compareTo(o2.getDateFirst());
                        }
                    };
                    presidentDataBase.getPresidents().sort(upToDate);
                    System.out.println(presidentDataBase.getPresidents());
                }
                break;
                case 2: {
                    Comparator<President> downToDate = new Comparator<President>() {
                        @Override
                        public int compare(President o1, President o2) {
                            return o2.getDateFirst().compareTo(o1.getDateFirst());
                        }
                    };
                    presidentDataBase.getPresidents().sort(downToDate);
                    System.out.println(presidentDataBase.getPresidents());


                }
                break;
                case 3: {
                    System.out.println("Введите дату");
                    String dateStr1 = reader.readLine();
                    if (!dateStr1.matches(regex)) { //проверить корректность даты
                        throw new DateInvalidFormat("неверный формат даты");
                    }
                    for (President p : presidentDataBase.getPresidents()) {
                        if (p.getDateFirst().before(sdf.parse(dateStr1)) && p.getDateLast().after(sdf.parse(dateStr1))) {
                            System.out.println(p);
                        }
                    }

                }
                break;

                case 4: {
                    System.out.println("1.Введите имя");
                    name = reader.readLine();
                    System.out.println("2.Введите дату начала правления");
                    String dateStr1 = reader.readLine();
                    if (!dateStr1.matches(regex)) { //проверить корректность даты
                        throw new DateInvalidFormat("неверный формат даты");
                    }
                    System.out.println("3.Введите дату окончания правления");
                    String dateStr2 = reader.readLine();
                    if (!dateStr2.matches(regex)) { //проверить корректность даты
                        throw new DateInvalidFormat("неверный формат даты");
                    }
                    System.out.println("4.Введите партию");
                    party = reader.readLine();
                    String newPresent = "\n" + name + "; " + dateStr1 + "; " + dateStr2 + "; " + party;
                    presidentDataBase.addPres(new President(name, sdf.parse(dateStr1), sdf.parse(dateStr2), party));
                    bufferedWriter.write(newPresent);
                    bufferedWriter.flush();

                }
                break;

                case 5: {
                    FileWriter fileWriter1 = new FileWriter(String.valueOf(path));
                    BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
                    writeToFile(presidentDataBase.getPresidents(), bufferedWriter1);
                    bufferedWriter.close();
                    bufferedReader.close();
                    bufferedWriter1.close();
                    reader.close();
                    isOver = true;
                }
                break;
            }
        }
    }

    public static void writeToFile(ArrayList<President> presidents, BufferedWriter bufferedWriter) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        for (President p : presidents) {
            String newPresent = p.getName() + "; " + sdf.format(p.getDateFirst()) + "; " + sdf.format(p.getDateLast()) + "; " + p.getParty() + "\n";
            bufferedWriter.write(newPresent);
        }
        bufferedWriter.flush();
    }
}
