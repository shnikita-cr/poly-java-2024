package ch_10.sect_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task_10_01_04 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); // сканер для считывания с консоли
        System.out.println("Enter file path: ");
        String path = cin.nextLine(); // просим пользователя ввести путь к файлу
        try (FileInputStream f = new FileInputStream(path)) { // объявляем файловый поток Внутри try()
            /*
            такое объявление возможно, так как FileInputStream реализует интерфейс AutoClosable
            интерфейс предоставляет метод close() который закрывает поток/файл/...
            в таком случае вне зависимости от того, произойдут ли ошибки внутри блока try,
            f.close() будет вызван при выходе из try и файл будет закрыт (а не останется висящим)
            это упрощает работу с файлами и исключениями
            механизм называется Try with resources и доступен в Java в новых версиях
             */
            Scanner fin = new Scanner(f); // сканер для считывания с файла
            while (fin.hasNextLine()) {
                System.out.println(fin.nextLine()); //считывания файла построчно и вывод в консоль
            }
        } catch (FileNotFoundException e) { //обработка ошибок
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        /*
        здесь файл (если был открытым) будет закрыт
        без AutoClosable необходимо было бы писать код закрытия файла с проверками:
        finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */
    }
}
