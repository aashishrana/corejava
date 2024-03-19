import java.util.*;
class Shape {
    String color;
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l , int h) {
        System.out.println(1/2 * l * h);
    }

}

class EquilateralTriangle extends Triangle {
    public void area(int l , int h) {
        System.out.println(1/2 *l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}


public class Inheri {
    public static void main (String args[]) {
        // System.out.println("Hello");

        // Triangle t1 = new Triangle();
        // t1.color = "red";
        Shape s1 = new Shape();
        s1.color = "red";

        s1.area();
    }
}