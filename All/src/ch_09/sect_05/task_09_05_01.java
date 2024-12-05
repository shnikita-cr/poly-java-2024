package ch_09.sect_05;

import java.util.Scanner;

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class task_09_05_01 {
    public static void performOperation(int i, int j) {
        if (i == j) {
            System.out.println(i);
        } else
            throw new MyException("Error: arguments are not equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        try {
            performOperation(i, j);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}