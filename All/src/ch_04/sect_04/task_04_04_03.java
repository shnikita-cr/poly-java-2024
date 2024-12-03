package ch_04.sect_04;

public class task_04_04_03 {
    static class A {
        void method1() {
            System.out.println("A.method()");
        }

        void method2(int a) {
            System.out.println("A.method2(" + a + ")");
        }
    }

    static class B extends A {
        @Override
        void method1() {
            System.out.println("B.method()");
        }


//        @Override
        void method2(float a) {
            System.out.println("B.method2(" + a + ")");
        }

        /*
        при попытке написать и скомпилировать код выше с указанием @Override возникнет ошибка компиляции,
        так как аннотация override указана к методу, который не переопределяет
        метод суперкласса - это помогает найти ошибку и верно переопределить метод
         */
    }
}
