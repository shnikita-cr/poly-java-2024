package ch_09.sect_09;

public class task_09_09_01 {
    public class App {
        final static int START_COUNTER;

        static {
            START_COUNTER = Integer.parseInt("Y-");
        }

        public static void main() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        App.main();
        /*
        При выполнении данного кода произойдет исключение ExceptionInInitializerError.
        Статическое поле START_COUNTER инициализируется при создании класса,
        выполняется Integer.parseInt(), но так как Y- не является числом и parseInt
        не может получить из него число происходит исключение
         */
    }
}
