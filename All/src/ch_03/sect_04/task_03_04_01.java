package ch_03.sect_04;

public class task_03_04_01 {
    void printMe() {
        System.out.println("task_03_04_01");
    }

    void print(int num) {
        System.out.println(num);
    }

    void print(String str) {
        System.out.println(str);
    }
}

class task_03_04_02 extends task_03_04_01 {
    @Override
    void printMe() {
        System.out.println("task_03_04_02");
    }

    void printValues() {
        print(50);
        print("fifty");
    }
}
