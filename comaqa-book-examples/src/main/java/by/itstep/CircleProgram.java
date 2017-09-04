package by.itstep;

public class CircleProgram {

    public void main(String[] args) {
        Circle circle1 = new Circle(-1, -2);
        Circle circle2 = new Circle(2, 3);

        System.out.println(circle2.getDistanceFromCenterToPoint(circle1.x, circle1.y));
    }

    public class Circle {
        int x;
        int y;

        public Circle(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double getDistanceFromCenterToPoint(int x, int y) {
            return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) ;
        }
    }
}
