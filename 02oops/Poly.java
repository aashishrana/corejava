class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(int age, String name) {
        System.out.println(name + " " + age);
    }
}

public class Poly {
    public static void main (String [] args) {
        System.out.println("Hello");
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 30;
        s1.printInfo(20);
        s1.printInfo("Aashish");
        // s1.printInfo()
        s1.printInfo(20, "Hello");
        s1.printInfo(s1.age, s1.name);
    } 
}