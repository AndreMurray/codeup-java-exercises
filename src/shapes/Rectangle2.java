package shapes;

public class Rectangle2  extends Quadrilateral implements Measurable{

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public Rectangle2(int length) {
        super(length);
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
}
