import java.util.ArrayList;
import java.util.List;

// Client code.
class Application {
    private List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("red");
        circle.setRadius(20);
        circle.setFont(new Font("Arial", 10));
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("red");
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setFont(new Font("Arial", 10));
        shapes.add(rectangle);
    }

    // Shallow copy method
    public List<Shape> shallowCopy() {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape s : shapes) {
            shapesCopy.add(s);
        }
        return shapesCopy;
    }

    // Deep copy method
    public List<Shape> deepCopy() {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }
        return shapesCopy;
    }

    public static void main(String[] args) {
        Application app = new Application();

        System.out.println("Main shape array: ");
        for (Shape ele: app.shapes){
            System.out.printf("%s\n", ele.getColor());
        }

        System.out.println("\nAfter performing shallow copy change");
        List<Shape> shallowCopy = app.shallowCopy();
        shallowCopy.get(0).setColor("blue");

        for (Shape ele: app.shapes){
            System.out.printf("%s\n", ele.getColor());
        }

        List<Shape> deepCopy = app.deepCopy();
        deepCopy.get(0).setColor("black");

        System.out.println("\nAfter performing deep copy change");
        for (Shape ele: app.shapes){
            System.out.printf("%s\n", ele.getColor());
        }
        System.out.println("\nDeep copy array: ");
        for (Shape ele: deepCopy){
            System.out.printf("%s\n", ele.getColor());
        }

        // Shallow copy
//        List<Shape> shallowCopy = app.shallowCopy();
//        System.out.println("Shallow copy: " + shallowCopy);
//
//        // Deep copy
//        List<Shape> deepCopy = app.deepCopy();
//        System.out.println("Deep copy: " + deepCopy);

        System.out.println("\n\n\nNow changing font and seeing the color\n");
        System.out.println("Main shape array: ");
        for (Shape ele: app.shapes){
            System.out.printf("%s\n", ele.getFont().getFont_name());
        }

        System.out.println("\nAfter performing shallow copy change");
        List<Shape> shallowCopy1 = app.shallowCopy();
        shallowCopy1.get(0).getFont().setFont_name("Varenda");

        for (Shape ele: app.shapes){
            System.out.printf("%s\n", ele.getFont().getFont_name());
        }

        List<Shape> deepCopy1 = app.deepCopy();
        deepCopy1.get(0).getFont().setFont_name("Times");

        System.out.println("\nAfter performing deep copy change");
        for (Shape ele: app.shapes){
            System.out.printf("%s\n", ele.getFont().getFont_name());
        }

        System.out.println("\nDeep copy array: ");
        for (Shape ele: deepCopy){
            System.out.printf("%s\n", ele.getFont().getFont_name());
        }
    }
}
