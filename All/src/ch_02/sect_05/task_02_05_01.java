package ch_02.sect_05;

public class task_02_05_01 {
    public static void main(String[] args) {
        int a = 3;
        int i = 0;
        if (a == 1) { // обычный if
            i = 1;
        } else if (a == 2) {
            i = 2;
        } else {
            i = 3;
        }
        
        i = a == 1 ? 1 : (a == 2 ? 2 : 3); // конструкция ?:
    }
}
