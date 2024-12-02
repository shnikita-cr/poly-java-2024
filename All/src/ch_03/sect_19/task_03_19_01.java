package ch_03.sect_19;

public class task_03_19_01 {
    public static void print(int... numbers) {
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public static void print(String... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        print("hi", "hello", "nihao");
    }
}
