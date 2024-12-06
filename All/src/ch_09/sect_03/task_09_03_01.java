package ch_09.sect_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class task_09_03_01 {
    public static void main(String[] args) {
        /*
        Приведите пример кода, в котором продемонстрированы следующие ситуации:

    несколько исключений обрабатываются абсолютно идентичным образом;
    исключения, которые обрабатываются, образуют иерархию Ex1 <|-- Ex2 <|-- Ex3, т.е. Ex3 - подкласс Ex2, а Ex2 - подкласс Ex1.

         */
        String filename;
        Scanner sc = new Scanner(System.in);
        filename = sc.nextLine();

        System.out.println("Print text to save into file: ");
        try (FileOutputStream f = new FileOutputStream(filename)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                f.write(line.getBytes());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
