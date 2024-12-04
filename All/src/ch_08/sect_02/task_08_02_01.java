package ch_08.sect_02;

public class task_08_02_01 {
    public static void main(String[] args) {
        // 0. Создание StringBuffer и StringBuilder
        StringBuffer sbBuffer = new StringBuffer("Hello");
        StringBuilder sbBuilder = new StringBuilder("World");

        //1.
        System.out.println("Index of 'o': " + sbBuffer.indexOf("o") + " | " + sbBuilder.indexOf("o")); //Index of 'o': 4 | 1

        // 2. append() - добавляет строку
        sbBuffer.append(" StringBuffer");
        sbBuilder.append(" StringBuilder");
        System.out.println("After append: " + sbBuffer + " | " + sbBuilder); //After append: Hello StringBuffer | World StringBuilder

        // 3. insert() - вставляет строку по указанному индексу
        sbBuffer.insert(6, "Java ");
        sbBuilder.insert(6, "Java ");
        System.out.println("After insert: " + sbBuffer + " | " + sbBuilder); //After insert: Hello Java StringBuffer | World Java StringBuilder

        // 4. delete() - удаляет часть строки
        sbBuffer.delete(6, 11);
        sbBuilder.delete(6, 11);
        System.out.println("After delete: " + sbBuffer + " | " + sbBuilder); //After delete: Hello StringBuffer | World StringBuilder

        // 5. reverse() - переворачивает строку
        sbBuffer.reverse();
        sbBuilder.reverse();
        System.out.println("After reverse: " + sbBuffer + " | " + sbBuilder); //After reverse: reffuBgnirtS olleH | redliuBgnirtS dlroW

        // 6. length() - возвращает длину строки
        System.out.println("Length: " + sbBuffer.length() + " | " + sbBuilder.length()); //Length: 18 | 19

        // 7. replace() - заменяет часть строки
        sbBuffer.reverse().replace(0, 5, "Hi");
        sbBuilder.reverse().replace(0, 5, "Hi");
        System.out.println("After replace: " + sbBuffer + " | " + sbBuilder); //After replace: Hi StringBuffer | Hi StringBuilder

        // 8. substring() - извлекает часть строки
        String substringBuffer = sbBuffer.substring(3, 8);
        String substringBuilder = sbBuilder.substring(3, 8);
        System.out.println("Substring: " + substringBuffer + " | " + substringBuilder); //Substring: Strin | Strin

        // 9. capacity() - показывает текущую емкость объекта
        System.out.println("Capacity: " + sbBuffer.capacity() + " | " + sbBuilder.capacity()); //Capacity: 44 | 44

        // 10. setLength() - изменяет длину строки
        sbBuffer.setLength(5);
        sbBuilder.setLength(5);
        System.out.println("After setLength: " + sbBuffer + " | " + sbBuilder); //After setLength: Hi St | Hi St
    }
}
