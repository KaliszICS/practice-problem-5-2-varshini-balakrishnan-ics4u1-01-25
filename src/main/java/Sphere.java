public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }
    public double area() {
        return 4 * 3.14 * this.radius * this.radius;
    }
    public double volume() {
        return(4.0 / 3.0) * 3.14 * this.radius * this.radius * this.radius;
    }
}