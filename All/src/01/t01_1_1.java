class t1_parent {
    protected int age;

    t1_parent() {
        age = 1;
    }

    public int getAge() {
        return age;
    }
}

class t1_child extends t1_parent {
    // не изменяем смысл метода getAgeYears
    public int getAgeMonths() {
        return age * 12;
    } // добавляем новый метод расширяя исходный класс;
    // нарушением принципа Лисков было бы переопределение
    // метода getAge
}

public class t01_1_1 {
    public static void main(String[] args) {
        t1_parent parent = new t1_parent();
        System.out.println("parent age: " + String.valueOf(parent.getAge()));
        t1_child child = new t1_child();
        System.out.println("child age  years: " + String.valueOf(child.getAge()));
        System.out.println("child age months: " + String.valueOf(child.getAgeMonths()));
    }
}
