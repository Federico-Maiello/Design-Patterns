public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);

        circle.draw();
        rectangle.draw();
    }
}