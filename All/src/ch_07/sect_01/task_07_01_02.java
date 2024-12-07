package ch_07.sect_01;


interface InterfaceA {

    default void show() {
        System.out.println("Default method from InterfaceA");
    }
}

interface InterfaceB {

    default void show() {
        System.out.println("Default method from InterfaceB");
    }
}

class CombinedClass implements InterfaceA, InterfaceB {

    // класс реализует два интерфейса с одинаковыми default методами
    // в таком случае компилятор выдаст ошибку из-за неопределенности
    // для решения неопределенности нужно переопределить конфликтующий метод
    // и указать, как его использовать
    @Override
    public void show() {
        // Выбор определенного метода
        InterfaceA.super.show(); // Default method from InterfaceA
        InterfaceB.super.show(); // Default method from InterfaceB
        //используется явный вызов
        // InterfaceA.super.show() и InterfaceB.super.show()
        // что разрешает конфликт
        System.out.println("Overridden method in CombinedClass");
    }

}

public class task_07_01_02 {
    public static void main(String[] args) {
        CombinedClass obj = new CombinedClass();
        obj.show(); //печать в консоль:
        // Default method from InterfaceA
        // Default method from InterfaceB
        // Overridden method in CombinedClass
    }
}