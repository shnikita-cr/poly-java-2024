package ch_02.sect_01;

class task_02_01_7 {//практика #7

    static public void main(String[] args) {
        int a = 120;
        // byte b = a + 10;
        // ошибка: переменная меньшего типа инициализируется выражением широкого типа без явного сужения
        byte c = (byte) (a + 10);
        // ок, значение -126, выполнено явное сужающее преобразование к byte
        // byte d = a + 1;
        // ошибка компиляции: переменная меньшего типа инициализируется выражением широкого типа без явного сужения
    }
}