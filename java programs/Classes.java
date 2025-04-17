class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Classes {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Hema Sundar", 19);

        // Display student information
        student1.display();
    }
}