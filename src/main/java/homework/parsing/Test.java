package homework.parsing;


import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        Магазину нужно сохранять информацию о продажах для каждого сотрудника.
        Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:

Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника,
а значением сумма всех его продаж.

Пример ввода:


Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Пример вывода:
{Алексей=[10000], Дмитрий=[9000], Антон=[11000]}

Требования:
1. Должен быть метод public static Map<String, Long> getSalesMap(Reader reader)
2. Работа метода getSalesMap должна удовлетворять условию
         */

        ByteArrayInputStream base = new ByteArrayInputStream("Алексей 3000\nДмитрий \nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(base));
        System.out.println(getSalesMap(buffReader));

    }

    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Map<String, Long> salesMap = new HashMap<>();
        String str = "";
        String[] container;
        BufferedReader br = new BufferedReader(reader);
        while (br.ready()) {
            str = str.concat(br.readLine() + "\n");
        }
        String[] strings = str.split("\n");
        for (String s : strings) {
            container = s.split(" ");
            System.out.println(Arrays.toString(container));
            if (container.length == 2) {
                salesMap.merge(container[0], Long.parseLong(container[1]), Long::sum);
            }
        }

        return salesMap;
    }

}
