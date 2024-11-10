package ch_03.sect_02;

public class ClassB {
    public void accessClassA() {
        ClassA a = new ClassA();
        System.out.println("ClassB accessing fields from ClassA:");
        System.out.println("publicField: " + a.publicField);       // Доступен
        System.out.println("protectedField: " + a.protectedField); // Доступен
        System.out.println("defaultField: " + a.defaultField);     // Доступен
//         System.out.println("privateField: " + a.privateField);  // Недоступен
    }
}
