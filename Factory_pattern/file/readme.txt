Overview:
This example demonstrates the Factory Method Pattern, a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. In this scenario, we use shapes (Circle and Square) as the objects created by factories (CircleFactory and SquareFactory).

Components:
1. Shape Interface (Shape.java):
Interface defining the common behavior for shapes.
Contains a method draw to be implemented by concrete shapes.
2. Concrete Shapes (Circle.java and Square.java):
Classes implementing the Shape interface.
Provide specific implementations of the draw method for circles and squares.
3. ShapeFactory Interface (ShapeFactory.java):
Interface declaring the factory method createShape.
Used for creating instances of the Shape interface.
4. Concrete Factories (CircleFactory.java and SquareFactory.java):
Classes implementing the ShapeFactory interface.
Provide factory methods (createShape) to instantiate specific shapes (Circle and Square).
5. FactoryMethodExample (FactoryMethodExample.java):
Main class for testing the Factory Method Pattern.
Demonstrates the creation of shapes using different factories.

Usage:

Compilation:
Open a terminal in the directory containing the Java files.

Compile all Java files using the following command:
javac *.java

Execution:
Run the compiled program using the following command:

java FactoryMethodExample

Expected Output:

The program output will demonstrate the creation and drawing of a circle and a square.

Drawing a Circle
Drawing a Square

Understanding the Example:
The Shape interface provides a common contract for shapes.
Concrete shapes (Circle and Square) implement the Shape interface with specific drawing behaviors.
The ShapeFactory interface declares a factory method (createShape) for creating instances of Shape.
Concrete factories (CircleFactory and SquareFactory) implement the ShapeFactory interface and provide specific implementations of the factory method to create Circle and Square instances.
The FactoryMethodExample class demonstrates the usage of factories to create and draw shapes.