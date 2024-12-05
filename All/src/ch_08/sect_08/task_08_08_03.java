package ch_08.sect_08;

import java.util.Date;

class DetailedDateFormater {
    public static String formatDate(Date date) {
        /*
         Year %tY год 0000
         Month %tm месяц 00
         Day %td день месяца
         Time:
         %tH часы (24)
         %tM минуты
         */
        return String.format("Year: %tY %nMonth: %tm %nDay: %td%nTime: %tH:%tM", date, date, date, date, date);
    }
}

public class task_08_08_03 {
    public static void main(String[] args) {
        System.out.println(DetailedDateFormater.formatDate(new Date()));
    }
}
