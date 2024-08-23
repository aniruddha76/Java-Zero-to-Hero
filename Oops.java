class Pen {
    String color;
    String type; //ballpoint gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name + ": " + this.age);
    }

    // // Constructor - non parameter
    // Student() {
    //     System.out.println("Constructor Called");
    // }

    //Parameterised
    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Student (Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}

public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";
        
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpoint";
        
        pen1.printColor();
        pen2.printColor();

        // Student s1 = new Student("Aniruddha", 21);
        
        Student s1 = new Student();
        s1.name = "Aniruddha";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
