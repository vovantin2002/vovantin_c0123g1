package bai_6.circle_and_cylinder;

public class Circle {
    protected  double radius;
    protected String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return (Math.pow(getRadius(), 2)) * 3.14;
    }

}
