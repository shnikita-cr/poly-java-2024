import ch_03.sect_02.ClassA;

public class task_03_02_01 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println("Main accessing fields from ClassA:");
        System.out.println("publicField: " + a.publicField);       // Доступен
//         System.out.println("protectedField: " + a.protectedField); // Недоступен
//         System.out.println("defaultField: " + a.defaultField);     // Недоступен
//         System.out.println("privateField: " + a.privateField);     // Недоступен
    }
}
