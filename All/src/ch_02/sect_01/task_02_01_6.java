package ch_02.sect_01;

class task_02_01_6 {//практика #6

    static public void main(String[] args) {
        int i = 95;
        float pi = 3.14f;

        short si = (short) i;  // явное преобразование к short
        byte bi = (byte) (i % 10); // явное преобразование к byte
        float di = (float) (3.5 * pi); // явное преобразование к float
    }
}
