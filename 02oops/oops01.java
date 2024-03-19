class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something!!");

    }

    public void printColor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}


class Student {
    String name;
    int rollno;
    public void studentInfo() {
        System.out.println("student info");
        System.out.println(this.name);
        System.out.println(this.rollno);

    }

    // Student() {
    //     System.out.println("constructor called");   non peramtrize constructor
    // }

    Student(String name , int age) {
        this.name = name;
        this.rollno = age;
    }
}


public class oops01 {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "bowl";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "gel";

        pen1.write();
        pen1.printColor();

        pen2.printColor();

        Student stud1 = new Student();
        stud1.name = "Prakash";
        stud1.rollno = 10;

        stud1.studentInfo();
        Student s2 = new Student("Aman" , 20);
        s2.studentInfo();
        
    }

}