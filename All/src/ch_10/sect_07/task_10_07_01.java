package ch_10.sect_07;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class task_10_07_01 {
    public static void main(String[] args) {
        // используется абсолютный путь файла на рабочей станции
        try (FileInputStream f = new FileInputStream("D:/file.txt")) {
            Scanner scanner = new Scanner(f);
            String line = scanner.nextLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
