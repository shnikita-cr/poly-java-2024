package ch_01.sect_04;

//ниже приведен пример нарушения принципа:
class RectangleWrong {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class SquareWrong extends RectangleWrong {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

class RectangleTester {
    public void resizeRectangle(RectangleWrong rect) {
        rect.setWidth(5);
        rect.setHeight(10);
        assert rect.getArea() == 50; // Ожидаем, что площадь равна 5 * 10
        //но в случае, если на вход получен Square как наследник, assert будет ложным
    }
}