package ch_03.sect_15;

public class task_03_15_01 {
}

class A {
    static {
        System.out.println("static logic"); //(1) сначала это, тк создается первый объект класса и
        //должен выполниться статический блок при первом создании первым
    }

    private int id = 1;

    { //(2) затем это, так как этот блок указан выше всех нестатических, значение поля id при создании = 0 (по умолчанию),
        //поэтому выведет logic (1) id= 0
        System.out.println("logic (1) id= " + this.id);
    }

    {//(3) затем это, тк этот блок следующий в порядке объявления нестатических логических блоков,
        //идет после определения поля id=1, поэтому выведет logic (2) id= 1
        System.out.println("logic (2) id= " + id);
    }

    public A(int id) { //(4) к-р выполняется после выполнения последнего логического блока
        this.id = id; // устанавливает id (100)
        System.out.println("ctor id= " + id); // выводит ctor id= 100 тк передано значение 100
    }
}

class Main {
    public static void main(String[] args) {
        new A(100);
    }
}
