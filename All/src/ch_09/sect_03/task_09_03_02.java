package ch_09.sect_03;

public class task_09_03_02 {
    public static void main(String[] args) {
        // объявление final в catch делает переменную исключения неизменяемой
        try {
            throw new Exception("Test exception");
        } catch (final Exception e) {
            // e = new Exception("New exception"); // Ошибка: нельзя переназначить e
            System.out.println(e.getMessage());
        }
    }
}
