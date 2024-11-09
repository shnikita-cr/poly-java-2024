package ch_02.sect_01;

class task_02_01_8 {//практика #8

    static public void main(String[] args) {
        int a = 5;
        var c = (byte) a + 4; // var разворачивается в byte из-за явного преобразования
        var k = 5 / 6.5; // var разворачивается в double из-за результата деления int / double -> double
    }
}

