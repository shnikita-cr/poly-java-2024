package ch_03.sect_02;

public class ClassA {
    public int publicField = 1;         // Доступен везде
    protected int protectedField = 2;   // Доступен в пределах пакета и в подклассах
    int defaultField = 3;               // Доступен только в пакете
    private int privateField = 4;       // Доступен только в классе ClassA

    public void printFields() {
        System.out.println("publicField: " + publicField);
        System.out.println("protectedField: " + protectedField);
        System.out.println("defaultField: " + defaultField);
        System.out.println("privateField: " + privateField);
    }
}
