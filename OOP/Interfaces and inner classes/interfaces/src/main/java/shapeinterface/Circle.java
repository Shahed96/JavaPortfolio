package shapeinterface;

/**
 *
 * @author Shahed A.
 */
public class Circle implements Shape {

    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return (Math.PI * (radius * radius));
    }
}
