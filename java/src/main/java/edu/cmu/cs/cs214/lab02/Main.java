package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(2.0);
        Shape square = new Square(3.0);

        Renderer renderer_rectangle = new Renderer(rectangle);
        Renderer renderer_circle = new Renderer(circle);
        Renderer renderer_square = new Renderer(square);


        renderer_rectangle.draw();
        renderer_circle.draw();
        renderer_square.draw();
    }
}
