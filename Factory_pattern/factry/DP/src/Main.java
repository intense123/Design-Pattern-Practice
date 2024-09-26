public class Main {
    public static void main(String[] args) {
        // Creating objects of figures
        LineFigure line = new LineFigure();
        TextFigure text = new TextFigure();

        // Creating manipulators through the factory method of figures
        Manipulator manipulator1 = line.createManipulator();
        Manipulator manipulator2 = text.createManipulator();

        // Calling methods to test if they are working fine
        manipulator1.downClick();
        manipulator2.drag();
    }
}