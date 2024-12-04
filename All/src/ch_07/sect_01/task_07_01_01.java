package ch_07.sect_01;

interface I {
    static int ID = 0;

    public default String getIName() {
        return "I";
    }

    public static int getID() {
        return ID;
    }

    public void foo();
}

class II implements I {

    @Override
    public void foo() {
        System.out.println("II::foo");
    }
}

public class task_07_01_01 {
    public static void main(String[] args) {
        II ii = new II();
        ii.foo(); //II::foo
        System.out.println(I.getID()); //0
        System.out.println(ii.getIName()); //I
    }
}
