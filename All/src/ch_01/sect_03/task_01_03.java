package ch_01.sect_03;

import java.util.Scanner;

public class task_01_03 {
    static public void main(String[] args) {
        System.out.print("Введите Ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
    }
}
