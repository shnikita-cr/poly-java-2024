package ch_10.sect_01;

import java.io.FileInputStream;
import java.util.Scanner;

public class task_10_01_01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = cin.nextLine();
        try (FileInputStream f = new FileInputStream(path)) {
            int character; // переменная для хранения текущего символа
            while ((character = f.read()) != -1) {
                // считываем очередной символ методом read() класса FileInputStream
                System.out.print((char) character); //печатаем в консоль символ как char
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
