package ch_08.sect_01;

import java.util.StringJoiner;

public class task_08_01_02 {
    static void f1() {
        // StringJoiner с разделителем ", " и обрамлением "[ ]"
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Добавляем строки
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Вывод объединённой строки
        System.out.println(joiner); // [Apple, Banana, Cherry]
    }

    private static void f2() {
        // StringJoiner с разделителем "; " и обрамлением "{ }"
        StringJoiner joiner = new StringJoiner("; ", "{", "}");

        // Добавляем строки
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        // Вывод объединённой строки
        System.out.println(joiner); // [Apple, Banana, Cherry]
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
