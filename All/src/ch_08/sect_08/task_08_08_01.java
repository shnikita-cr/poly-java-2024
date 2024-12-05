package ch_08.sect_08;

class Worker {
    private String name;
    private int age;
    private Double salary;
    private Boolean hasChildren;

    public Worker(String name, int age, Double salary, Boolean hasChildren) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hasChildren = hasChildren;
    }

    @Override
    public String toString() {
        /*
        %% знак процента
        %s строка
        %d целое число
        %,.2f дробное с точностью 2 знака после запятой, с разделителями групп
        %b строковое представление булева типа
         */
        return String.format("%%Client%% %n{name=%s; age=%d; salary=%,.2f; hasChildren=%b", name, age, salary, hasChildren);
    }
}

public class task_08_08_01 {
    public static void main(String[] args) {
        Worker worker = new Worker("Ivan", 43, 54153.31, Boolean.TRUE);
        System.out.println(worker);
    }
}
