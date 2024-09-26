// Base prototype.
abstract class Shape {
    private int X;
    private int Y;
    private String color;
    private Font font;

    // A regular constructor.
    public Shape() {}

    // The prototype constructor.
    public Shape(Shape source) {
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
        this.font = source.font;
    }

    // The clone operation returns one of the Shape subclasses.
    public abstract Shape clone();

    // Getters and setters
    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
}
