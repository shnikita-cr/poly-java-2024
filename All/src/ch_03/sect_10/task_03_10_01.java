package ch_03.sect_10;

public class task_03_10_01 {
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public void runInside() { // вызов внутри метода того же класса
        printVars();
    }
}

class B {
    public void runOutside() { // вызов в методе другого класса через обращение к классу А
        A.printVars();
    }

    public void runFromObject() { // вызов в методе другого класса через обращение к методу объекта класса А
        A a = new A();
        a.printVars();
    }
}