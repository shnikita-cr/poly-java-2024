package ch_04.sect_09;

public class task_04_09_01 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test(3L);
        System.out.println("is 1 & 2 equal? " + t1.equals(t2)); //true
        System.out.println("is 1 & 3 equal? " + t1.equals(t3)); //false
    }
}

class Test {
    Long id = 0L;
    String name = "";
    char c = '\0';

    public Test() {
    }

    public Test(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Test) {
            return (id == ((Test) obj).id)
                    && (name.equals(((Test) obj).name))
                    && (c == ((Test) obj).c);
        }
        return false;
    }
}

