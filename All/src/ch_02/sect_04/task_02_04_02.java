package ch_02.sect_04;

public class task_02_04_02 {
    public static void main(String[] args) {
        Boolean b1 = true; // bool value boxing
        Boolean b2 = new Boolean(true); // deprecated
        Boolean b3 = Boolean.TRUE; // constant Boolean
        Boolean b4 = Boolean.valueOf(true); //obviuos boxing
        Boolean b5 = Boolean.valueOf("true"); //get value from String
    }
}
