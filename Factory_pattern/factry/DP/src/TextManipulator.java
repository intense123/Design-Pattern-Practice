// TextManipulator subclass
class TextManipulator extends Manipulator {

    // Constructor
    public TextManipulator(TextFigure textFigure) {
        super(textFigure);
    }

    // Implementing abstract methods from parent class
    @Override
    public void downClick() {
        System.out.println("Down click on text");
    }

    @Override
    public void drag() {
        System.out.println("Drag on text");
    }

    @Override
    public void upClick() {
        System.out.println("Up click on text");
    }
}