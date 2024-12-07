package ch_09.sect_07;

public class task_09_07_03 {
    public static void main(String[] args) {
        /*
        try {
            int a = 5 / 0;
        } finally {
            System.out.println("done");
        } finally{
            System.out.println("done");
        }
        */
        // нет, такую конструкцию нельзя использовать
        // недопустимо использование нескольких блоков finally - это
        // противоречит названию блока и логике его применения (действия,
        // которые нужно сделать после всех генераций исключений и проверок)
    }
}
