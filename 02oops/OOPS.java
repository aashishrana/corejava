class Pen {
    String color;  // Data
    String type;

    public void write() {  // function called members 
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}


class Student {
    String name;
    String address;

    public void printName() {
        System.out.println("Name printing");

        System.out.println(this.name);
    }

    public void printAddress() {
        System.out.println("address printing");
        System.out.println(this.address);
    }
}


public class OOPS {
    public static void main (String args[]) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "Bowl";

        p1.write();
        p1.printColor();
        p1.printType();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "Gel";

        p2.printColor();

        Student s1 = new Student();
        s1.name = "Vipin";
        s1.address = "Delhi";

        s1.printName();

    }

}