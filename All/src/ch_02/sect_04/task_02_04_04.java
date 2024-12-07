package ch_02.sect_04;

public class task_02_04_04 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));
        System.out.println("b1==i1 " + (b1 == i1));
        System.out.println("a1==b1 " + (a1 == b1)); // value 128 is not cached, new object was created
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2==b2 " + (a2 == b2)); // value 127 is cached, new object was not created
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    /*
    При инициализации Integer значением в пределах -128 127 происходит кэширование, используется IntegerCache. Благодаря этому при создании новых объектов с таким же значением новые объекты в памяти не создаются, используется ссылка на имеющийся объект с данным значением (если объект есть).
    В первом блоке a1==b1 вернет false, так как 128 не попадает в пределы кэширования, сравнения ссылок на разные объекты памяти дает false.
    Во втором блоке a1==b1 вернет true,  так как 127 попадает в пределы кэширования, сравнения ссылок на один и тот же объект памяти дает true.
     */
    }
}
