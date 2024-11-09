package ch_02.sect_03;

class task_02_03_2 {
    static class A {
    }

    static class B extends A {
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Boolean b1 = a instanceof A;//true
        Boolean b2 = b instanceof B;//true
        Boolean b3 = a instanceof B;//false
        Boolean b4 = b instanceof A;//true
        Boolean b5 = null instanceof A;//false
    }
}
