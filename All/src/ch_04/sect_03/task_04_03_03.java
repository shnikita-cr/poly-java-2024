package ch_04.sect_03;

public class task_04_03_03 {
    // A внутренний, для скрытия его от других классов А в том же пакете

    class A {
        int a;
        int b;
        int c;
        int z;

        public A() {
            this(0, 0, 0);
            this.z = 1;
        }

        public A(int a) {
            this(a, 0, 0);
            this.z = 1;
        }

        public A(int a, int b) {
            this(a, b, 0);
            this.z = 1;
        }

        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            z = 1;
        }
    }
}

