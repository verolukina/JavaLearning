package Rect;

public class MainRect {
    public static void main(String[] args) {
        Rect firstRect = new Rect();

        firstRect.setSizes(3,5.5);
        System.out.println("Perimeter is " + firstRect.perimeter());
        System.out.println("Area is " + firstRect.area());
    }
}
