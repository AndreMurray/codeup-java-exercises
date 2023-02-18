package shapes;

    public class Square extends Rectangle {
        public Square(int side) {
            super(side, side);
        }
        @Override
        public int getArea() {
            System.out.println("SQUARE VERSION AREA");
            return length * length;
        }

        @Override
        public int getPerimeter() {
            System.out.println("SQUARE VERSION PERIMETER");
            return 4 * length;
        }

    }

