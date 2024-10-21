package ch_02.sect_04;

public class task_02_04_01 {
    public static void main(String[] args) {
        Integer decimal = Integer.decode("123");
        Integer hex = Integer.decode("0x7B");
        Integer octal = Integer.decode("0173");

        System.out.println(decimal);  // 123
        System.out.println(hex);      // 123
        System.out.println(octal);    // 123
    }
}
