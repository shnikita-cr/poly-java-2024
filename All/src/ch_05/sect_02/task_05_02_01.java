package ch_05.sect_02;


interface I {

    static int a = 0;

    public static class Nested {

        public static void func() {
            System.out.println("func");
            System.out.println("a == " + a);
        }
    }
}


public class task_05_02_01 implements I {
    public static void main(String[] args) {
        Nested.func();
    }
}
