public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRedius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double diameter() {
        return 2 * this.radius;
    }
    public double perimeter() {
        return 2 + 3.14 * this.radius;
    }
    public double area() {
        return 3.14 * this.radius * this.radius;
    }
}