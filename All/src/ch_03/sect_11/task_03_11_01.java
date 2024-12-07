package ch_03.sect_11;

public class task_03_11_01 {
}

class A1 {
    public final int a;

    public A1() {
        this.a = 1;
    } //инициализация в конструкторе
}

class A2 {
    public final int a = 1; //инициализация при объявлении
}


class A3 {
    public final int a;

    { //инициализация в отдельном блоке
        a = 1;
    }
}


