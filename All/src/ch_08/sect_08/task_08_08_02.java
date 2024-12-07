package ch_08.sect_08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class task_08_08_02 {
    public static void main(String[] args) {
        /*
        метод flush() в Formatter используется, чтобы принудительно записать все данные,
        накопленные в буфере, в целевой поток (например, файл)
        таким образом файлы могут быть сразу записаны, а не будут ждать автоматической чистки буфера
        */
        try (Formatter formatter = new Formatter(new FileWriter("output.txt"))) {
            formatter.format("Hello, %s!", "World");
            formatter.flush(); // принудительно записываем накопленные данные
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // без вызова flush() данные могут остаться в буфере до закрытия Formatter или заполнения буфера
    }
}
