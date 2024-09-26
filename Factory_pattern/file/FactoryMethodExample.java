

public class FactoryMethodExample {
    public static void main(String[] args) {
        // Using CircleFactory to create a Circle
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        // Using SquareFactory to create a Square
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
    }
}