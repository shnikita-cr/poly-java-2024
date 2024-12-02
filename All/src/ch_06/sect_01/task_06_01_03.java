package ch_06.sect_01;

public interface task_06_01_03 {
}


class B {
    protected interface I {
        /*
        интерфейс не может быть объявлен
        с модификатором protected на уровне класса
        исключение: вложенные (nested) интерфейсы могут быть private
        такие интерфейсы доступны только внутри внешнего класса
         */
    }
}