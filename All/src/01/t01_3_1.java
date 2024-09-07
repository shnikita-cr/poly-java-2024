import java.util.Scanner;

public class t01_3_1 {
    static public void main(String[] args) {
        System.out.print("Введите Ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
    }
}
