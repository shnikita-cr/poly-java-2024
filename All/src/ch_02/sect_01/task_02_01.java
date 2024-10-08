package ch_02.sect_01;

class task_02_01_1 {//практика #1

    static public void main(String[] args) {
        byte b0 = 0, b1 = -128, b2 = 127;
        short s0 = 0, s1 = -32768, s2 = 32767;
        int i0 = 0, i1 = -2147483648, i2 = 2147483647;
        long l0 = 0, l1 = -1000000000, l2 = 2000000000;

        float f0 = 0.f, f1 = 3.14f;
        double d0 = 0, d1 = 2.7182;

        char c0 = '1', c1 = 'c';
        boolean bo0 = false, bo1 = true;
    }
}

class task_02_01_2 {//практика #2

    static public void main(String[] args) {
        String name = "\u041d\u0438\u043a\u0438\u0442\u0430!";
        System.out.println("Имя моё " + name);
    }
}

class task_02_01_3 {//практика #3

    static public void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }
        // int c = a + b; // в переменной с не будет значения, так как она зависит от b,
        // время жизни которой закончилось после скобки },
        // код не скомпилируется
    }
}

class task_02_01_4 {//практика #4

    static public void main(String[] args) {
        String name = "Иван", surname = "Иванов";
        String fullName = name + ' ' + surname;
        // name = String - объект
        // ' '  = Char - базовый тип
        String s1 = "a" + surname;
        System.out.println(fullName);
    }
}

class task_02_01_5 {//практика #5

    static public void main(String[] args) {
        float pi = 3.14f;
        float pi2 = pi * 2; // умножение float int -> float, так как
        // float больший

        int k1 = 3;
        double k2 = 4;
        double k12 = k1 / k2;
        // деление int / double -> double, расширение к большему double
    }
}

class task_02_01_6 {//практика #6

    static public void main(String[] args) {
        int i = 95;
        float pi = 3.14f;

        short si = (short) i;  // явное преобразование к short
        byte bi = (byte) (i % 10); // явное преобразование к byte
        float di = (float) (3.5 * pi); // явное преобразование к float
    }
}

class task_02_01_7 {//практика #7

    static public void main(String[] args) {
        int a = 120;
        // byte b = a + 10;
        // ошибка: переменная меньшего типа инициализируется выражением широкого типа без явного сужения
        byte c = (byte) (a + 10);
        // ок, значение -126, выполнено явное сужающее преобразование к byte
        // byte d = a + 1;
        // ошибка компиляции: переменная меньшего типа инициализируется выражением широкого типа без явного сужения
    }
}

class task_02_01_8 {//практика #8

    static public void main(String[] args) {
        int a = 5;
        var c = (byte) a + 4; // var разворачивается в byte из-за явного преобразования
        var k = 5 / 6.5; // var разворачивается в double из-за результата деления int / double -> double
    }
}

