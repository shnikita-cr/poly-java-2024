package ch_09.sect_01;

public class task_09_01_02 {
    public static void main(String[] args) {
        ArithmeticExceptionEx();
        ArrayIndexOutOfBoundsExceptionEx();
        IllegalArgumentExceptionEx();
        ClassCastExceptionEx();
        NullPointerExceptionEx();
    }

    private static void ArithmeticExceptionEx() {
        int a = 5, b = 0;
        try {
            int c = a / b; //деление на 0 -> генерируется исключение
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ArrayIndexOutOfBoundsExceptionEx() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= numbers.length; i++) { // из-за условие <= numbers.length будет генерироваться исключение
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double squareRoot(int a) {
        if (a < 0) {// отрицательные значения не обрабатываются, генерируется исключение
            throw new IllegalArgumentException("Number must be non-negative");
        }
        return Math.sqrt(a);
    }

    private static void IllegalArgumentExceptionEx() {
        int number = -1;
        try {
            double sqrt = squareRoot(number);
            System.out.println(sqrt);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ClassCastExceptionEx() {
        Animal animal = new Animal("White");
        try {
            Dog dog = (Dog) animal; // неправильное приведение в иерархии классов генерируется исключение
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void NullPointerExceptionEx() {
        String ptr = null;
        try {
            if (ptr.equals("abcd")) // сравнение с null, генерируется исключение
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}


class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }

    void eat(String name) {
        System.out.println(name + " is eating .....");
    }

    void show(String name) {
        System.out.println(name + " is of " + color + " Color");
    }
}

class Dog extends Animal {
    Dog(String color) {
        super(color);
    }
}