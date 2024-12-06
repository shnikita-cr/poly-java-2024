package ch_09.sect_07;

public class task_09_07_02 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } finally {
            System.out.println("finally");
        }
        // да, такую конструкцию использовать можно
        // здесь исполняется код блока try и вне зависимости от наличия исключений
        // происходит блок finally
        // тем не менее исключение будет считаться необработанным и нужно "поймать"
    }
}
