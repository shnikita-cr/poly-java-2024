package ch_01.sect_01;

// исправленный пример реализует принцип и не нарушает поведение программы при подстановке
class SquareRight {
    protected int side;

    public SquareRight(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

class RectangleRight extends SquareRight {
    private int width;

    public RectangleRight(int side, int width) {
        super(side);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return side * width;
    }
}
