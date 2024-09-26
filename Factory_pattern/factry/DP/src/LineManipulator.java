// LineManipulator subclass
class LineManipulator extends Manipulator {

    // Constructor
    public LineManipulator(LineFigure lineFigure) {
        super(lineFigure);
    }

    // Implementing abstract methods from parent class
    @Override
    public void downClick() {
        System.out.println("Down click on line");
    }

    @Override
    public void drag() {
        System.out.println("Drag on line");
    }

    @Override
    public void upClick() {
        System.out.println("Up click on line");
    }
}
