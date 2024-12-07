package ch_04.sect_03;

class A {
    int a;

    void method() {
    }
}

class B extends A {
}

class C extends B {
    void method() {
        int a = super.a;
        super.method();
    }
}

public class task_04_03_02 {
    public static void main(String[] args) {
        C c = new C(); //код работает
        c.method(); //код работает
        // произойдет обращение к C::method, код которого обратится к
        // A, в котором int a и method определены

        // int a и method() доступны внутри иерархии и пакета,
        // в котором определен исходный класс A
    }
}
