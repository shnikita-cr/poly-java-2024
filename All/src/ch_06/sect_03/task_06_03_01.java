package ch_06.sect_03;

public class task_06_03_01 {
    class A {
        void f() {
            System.out.println("A");
        }
    }

    class B extends A {
        @Override
            // Override обращаем внимание читающего и компилятора на то, что мы хотим перегрузить метод суперкласса
        void f() {
            System.out.println("B");
        }

        @Deprecated
            // Deprecated обращаем внимание читающего и компилятора на то, что метод g далее не поддерживается как, например, устаревший
            // и его не стоит использовать
        void g() {
            System.out.println("no longer active...");
        }

        @SuppressWarnings("unused")
        // говорим игнорировать предупреждающие сообщения, связанные с тем, что части e() не используется
        private void e() {
            int v = 42;
        }
    }
}
