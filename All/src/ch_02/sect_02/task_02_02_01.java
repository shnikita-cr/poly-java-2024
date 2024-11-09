package ch_02.sect_02;

/**
 * Класс для вычисления математических операций.
 *
 * @since 1.0
 */
public class task_02_02_01 {

    /**
     * Сложение двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма чисел a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Деление двух чисел.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws ArithmeticException если b равно нулю
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) a / b;
    }
}
