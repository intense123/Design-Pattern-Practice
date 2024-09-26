// TextFigure subclass
class TextFigure extends Figure {
    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }
}