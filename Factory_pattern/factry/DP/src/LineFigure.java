// LineFigure subclass
class LineFigure extends Figure {
    @Override
    public Manipulator createManipulator() {
        return new LineManipulator(this);
    }
}