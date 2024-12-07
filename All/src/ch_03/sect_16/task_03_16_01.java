package ch_03.sect_16;

public class task_03_16_01 {
}

class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }

    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }

    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }

    public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
}


class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};//массив объектов типа Number
        // цикл for (1)
        for (Number n : num) { //цикл по объектам типа Number
            a.printNum(n); // в перегруженный метод printNum передается объект Number
            // и вызывается void printNum(Number)
            // как лучшее совпадение типов Number -> Number
            // тогда как другие реализации требуют приведения типов
        }
        // (2)
        a.printNum(new Integer(1)); //передается аргумент типа Integer
        a.printNum(11); //передается аргумент типа int
        a.printNum(1.11f); //передается аргумент типа float
        a.printNum(11.11);//передается аргумент типа double
    }
}