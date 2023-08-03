package shapes;

public class Quadrilateral  extends Shape{
protected int length;
protected int width;

//public Shape();

    public Quadrilateral(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
