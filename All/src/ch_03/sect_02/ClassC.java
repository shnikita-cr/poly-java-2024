import ch_03.sect_02.ClassA;

public class ClassC extends ClassA {
    public void accessClassA() {
        System.out.println("ClassC accessing fields from ClassA:");
        System.out.println("publicField: " + publicField);         // Доступен
        System.out.println("protectedField: " + protectedField);   // Доступен (унаследовано)
//         System.out.println("defaultField: " + defaultField);     // Недоступен
//         System.out.println("privateField: " + privateField);     // Недоступен
    }
}
