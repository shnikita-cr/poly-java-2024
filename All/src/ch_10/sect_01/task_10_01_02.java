package ch_10.sect_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class task_10_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        String filename = name + ".txt";
        try (FileOutputStream f = new FileOutputStream(filename)) {
            f.write(name.getBytes()); // метод write класса FileOutputStream
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
