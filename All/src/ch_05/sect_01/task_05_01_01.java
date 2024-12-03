package ch_05.sect_01;

public class task_05_01_01 {
    //доступен извне везде, где доступен внешний класс.
    public class PublicInner {
        public void display() {
            System.out.println("Public Inner Class");
        }
    }

    protected class ProtectedInner {
        //доступен только в пакете и в подклассах внешнего класса.
        void display() {
            System.out.println("Protected Inner Class");
        }
    }

    class DefaultInner {
        //доступен только в пределах пакета
        void display() {
            System.out.println("Default Inner Class");
        }
    }

    private class PrivateInner {
        //доступен только внутри внешнего класса.
        void display() {
            System.out.println("Private Inner Class");
        }
        // использование возможно только через методы внешнего класса.
    }

    public void accessPrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.display();
    }
}
