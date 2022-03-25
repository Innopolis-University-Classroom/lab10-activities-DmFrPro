package src.ru.innopolis.problem1;

interface AbstractShapeFactory {
    Shape createShape();
}

class RectangularFactory implements AbstractShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

class EllipticFactory implements AbstractShapeFactory {
    @Override
    public Shape createShape() {
        return new Ellipse();
    }
}

class SquareFactory implements AbstractShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

class CircleFactory implements AbstractShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}


interface Shape {
}

class Ellipse implements Shape {
}

class Circle extends Ellipse {
}

class Rectangle implements Shape {
}

class Square extends Rectangle {
}

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}