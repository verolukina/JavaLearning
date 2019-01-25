package Rect;

public class Rect {
    double width;
    double length;

    void setSizes(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double perimeter() {
        return (width + length) * 2;
    }

    double area() {
        return width * length;
    }
}
