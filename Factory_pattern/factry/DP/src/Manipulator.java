// Abstract Manipulator class
abstract class Manipulator {
    protected Figure figure;

    public Manipulator(Figure figure) {
        this.figure = figure;
    }

    public abstract void downClick();

    public abstract void drag();

    public abstract void upClick();
}