package ch_04.sect_04;

public class task_04_04_01 {
    public static void print(Integer i) {
        System.out.println(i);
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        print(5); //вызов print(Integer)
        print("hello"); //вызов print(String)
    }
}
