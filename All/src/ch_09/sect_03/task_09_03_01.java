package ch_09.sect_03;

class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class task_09_03_01 {
    public static void main(String[] args) {
        f1(1);
        f2(3);
    }

    private static void f1(Integer a) {
        try {
            processArgument(a);
        } catch (Ex1 | IllegalArgumentException e) { // Идентичная обработка
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void f2(Integer a) {
        try {
            processArgument(a);
        } catch (Ex3 ex3) {
            System.out.println("Ex3 handled: " + ex3.getMessage());
        } catch (Ex2 ex2) {
            System.out.println("Ex2 handled: " + ex2.getMessage());
        } catch (Ex1 ex1) {
            System.out.println("Ex1 handled: " + ex1.getMessage());
        } catch (Exception ex) {
            System.out.println("General Exception handled: " + ex.getMessage());
        }
    }

    private static void processArgument(Integer a) throws Ex1 {
        if (a == 1)
            throw new Ex1("trivial a");
        if (a % 2 == 1)
            throw new Ex2("odd a ");
        if (a < 0)
            throw new Ex3("negative a");
        if (a == Integer.MAX_VALUE)
            throw new IllegalArgumentException();
        System.out.println(a);
    }
}