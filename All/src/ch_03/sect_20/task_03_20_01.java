package ch_03.sect_20;


public class task_03_20_01 {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    public static void main(String[] args) {
        Day weekendStart = Day.SATURDAY;
        Day weekendEnd = Day.SUNDAY;
        System.out.println("start " + weekendStart + ", end " + weekendEnd);
    }
}
