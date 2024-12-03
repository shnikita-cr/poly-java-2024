package ch_04.sect_04;

public class task_04_04_02 {
    static class A {
        void method1() {
            System.out.println("A::void method1()");
        }

        private void method2() {
            System.out.println("A::void method2()");
        }
    }

    static class B extends A {
        void method1() {
            /*
            при попытке вернуть другое значение при переопределении
            будет ошибка компиляции
            */
            super.method1();
            System.out.println("B::void method1()");
        }

        int method2() {
            /*
            возможно "переопределение" (с другим возвращаемым типом)
            метода суперкласса в наследнике, если они не "видны"
            друг для друга, например:
            private A::void method()
            B::int method()
             */

            System.out.println("B::int  method2()");
            return 0;
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method1(); //A::void method1()
        b.method1(); //A::void method1() затем A::void method1()
        System.out.println("----------------");
        a.method2(); //A::void method2()
        b.method2(); //B::int  method2()
    }
}