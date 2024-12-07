package ch_02.sect_06;

public class task_02_06_02 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        switch (j) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3: // выполнится при 2 и при 3
                i = 3;
                break;
        }
        // Если break будет отсутствовать в некоторой части case,
        // то после выполнения этой некоторой части будет выполняться код
        // последующих частей до конца или до break.
        // В данном примере выполнится код части case 2 и case 3,
        // если переменная равна 2
    }
}
