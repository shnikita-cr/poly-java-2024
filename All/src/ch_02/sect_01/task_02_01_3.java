package ch_02.sect_01;

class task_02_01_3 {//практика #3

    static public void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }
        // int c = a + b; // в переменной с не будет значения, так как она зависит от b,
        // время жизни которой закончилось после скобки },
        // код не скомпилируется
    }
}