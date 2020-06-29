package lesson.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String str = sdf.format(date); //конвертирует из date в string
        System.out.println(str);

        String date1 = "1.1.2020";
        String date2 = "1.4.2020";

        Date myDate1 = sdf.parse(date1);
        Date myDate2 = sdf.parse(date2);

        System.out.println(sdf.format(myDate1));
        System.out.println(sdf.format(myDate2));

        System.out.println(myDate1.compareTo(myDate2));
        List<Date> dates = new ArrayList<>();
        dates.add(myDate2);
        dates.add(myDate1);

        Collections.sort(dates);

        for(Date val : dates){
            System.out.println(sdf.format(val));
        }


    }
}
