package ch_02.sect_07;

public class task_02_07_02 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            k += i;
            if (k % i == 0) {
                continue;
            }
            k += 1;
            if (k == 32)
                break;
        }
    }
}