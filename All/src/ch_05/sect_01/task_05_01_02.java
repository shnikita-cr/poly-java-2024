package ch_05.sect_01;

class Outer {
    private String message = "Hello from Outer";

    public void setMessage(String message) {
        this.message = message;
    }

    protected String getMessage() {
        return message;
    }

    public class Inner {
        /*
        для внутреннего класса есть полный доступ к членам внешнего класса
         */
        public void display() {
            System.out.println(message); // доступ к private полю внешнего класса
        }

        public void test() {
            setMessage("Hello from Inner"); // доступ к public методу внешнего класса
            String resultMessage = getMessage(); // доступ к protected методу внешнего класса
            System.out.println("resultMessage " + resultMessage);
        }
    }
}

public class task_05_01_02 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();
        inner.display(); // Hello from Outer
        inner.test(); //resultMessage Hello from Inner
    }
}
