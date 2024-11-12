package ch_03.sect_17;

class A<T> {
    private T a;

    public A(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}


public class task_03_17_01 {
    public static void main(String[] args) {
        A<String> stringInstance = new A<>("Hello");
        A<Integer> integerInstance = new A<>(123);

        if (stringInstance instanceof A) {
            System.out.println("stringInstance is an instance of A");
        }

        if (integerInstance instanceof A) {
            System.out.println("integerInstance is an instance of A");
        }

        // A<?>  -> wildcard - тип (любой)
        if (stringInstance instanceof A<?>) {
            System.out.println("stringInstance is an instance of A<?>");
        }

        if (integerInstance instanceof A<?>) {
            System.out.println("integerInstance is an instance of A<?>");
        }

        // невозможно проверить конкретный параметризованный тип
        // из-за стирания типов
        // if (stringInstance instanceof A<String>) { // Ошибка компиляции
        //     System.out.println("This line will cause a compilation error");
        // }
    }
}
