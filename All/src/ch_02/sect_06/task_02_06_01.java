package ch_02.sect_06;

public class task_02_06_01 {
    //int
    public void f1() {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    //char
    public void f2() {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }

    //byte
    public void f3() {
        byte num = 2;

        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }

    //short
    public void f4() {
        short num = 155;

        switch (num) {
            case 50:
                System.out.println("Number is 50");
                break;
            case 100:
                System.out.println("Number is 100");
                break;
            case 150:
                System.out.println("Number is 150");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }

    //string
    public void f5() {
        String season = "Spring";
        switch (season) {
            case "Winter":
                System.out.println("Cold season");
                break;
            case "Spring":
                System.out.println("Flowers bloom");
                break;
            case "Summer":
                System.out.println("Hot season");
                break;
            case "Autumn":
                System.out.println("Leaves fall");
                break;
            default:
                System.out.println("Unknown season");
                break;
        }
    }

    //enum
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public void f6() {

        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case FRIDAY:
                System.out.println("Almost weekend");
                break;
            case SUNDAY:
                System.out.println("Rest day");
                break;
            default:
                System.out.println("Work in progress");
                break;
        }
    }
}
