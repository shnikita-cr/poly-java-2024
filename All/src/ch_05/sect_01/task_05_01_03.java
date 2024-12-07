package ch_05.sect_01;

public class task_05_01_03 {
    static class Inner {
        int a;
        public float b;
        protected double c;
        private String d;

        int getA() {
            return a;
        }

        public float getB() {
            return b;
        }

        protected double getC() {
            return c;
        }

        private String getD() {
            return d;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    ", d='" + d + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner); //Inner{a=0, b=0.0, c=0.0, d='null'}
        /*
        внешний класс имеет доступ ко всем полям и методам внутреннего класса
         */
        inner.a = 1;
        inner.b = 2;
        inner.c = 3;
        inner.d = "d";
        System.out.println(inner); //Inner{a=1, b=2.0, c=3.0, d='d'}
        int a = inner.getA(); //1
        float b = inner.getB(); //2.0
        double c = inner.getC(); //3.0
        String d = inner.getD(); //'d'
    }
}

