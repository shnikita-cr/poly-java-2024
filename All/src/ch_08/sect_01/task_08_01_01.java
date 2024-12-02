package ch_08.sect_01;

public class task_08_01_01 {
    public static void main(String[] args) {
        String str = "Hello, Java World!";

        // 1. charAt()
        System.out.println(str.charAt(7)); // Возвращает символ на индексе 7 ('J').

        // 2. length()
        System.out.println(str.length()); // Возвращает длину строки (18).

        // 3. substring()
        System.out.println(str.substring(7, 11)); // Извлекает подстроку "Java".

        // 4. toUpperCase()
        System.out.println(str.toUpperCase()); // Преобразует строку в верхний регистр.

        // 5. toLowerCase()
        System.out.println(str.toLowerCase()); // Преобразует строку в нижний регистр.

        // 6. indexOf()
        System.out.println(str.indexOf("Java")); // Находит индекс первого вхождения подстроки (7).

        // 7. replace()
        System.out.println(str.replace("Java", "Kotlin")); // Заменяет "Java" на "Kotlin".

        // 8. startsWith()
        System.out.println(str.startsWith("Hello")); // Проверяет, начинается ли строка с "Hello" (true).

        // 9. endsWith()
        System.out.println(str.endsWith("World!")); // Проверяет, заканчивается ли строка на "World!" (true).

        // 10. trim()
        String str2 = "   Extra spaces   ";
        System.out.println("/" + str2 + "/");
        System.out.println("/" + str2.trim() + "/"); // Убирает пробелы в начале и конце строки.
    }
}



