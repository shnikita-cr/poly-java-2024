package ch_09.sect_02;

import java.util.ArrayList;
import java.util.List;

public class task_09_02_01 {

    static int makeDivistion(int a, int b) {
        return a / b;
    }

    static void printList(List<Integer> list) {
        for (int i = 0; i <= list.size(); i++) {
            System.out.println("list[" + i + "] == " + list.get(i));
        }
    }

    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            int divResult = makeDivistion(a, b);
            System.out.println(divResult);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); //обработанное арифметическое исключение (деление на ноль)
        }
        List<Integer> list = new ArrayList<Integer>(List.of(a, b));
        printList(list); // необработанное исключение выход за границы массива
    }
}
