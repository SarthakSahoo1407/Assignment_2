package A;
//Create a class Student having member variable name, age, mark and required member variable

import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double marks;
    private boolean required;

    public Student(String name, int age, double marks, boolean required) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.required = required;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isRequired() {
        return required;
    }

    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.add(new Student("Alice", 20, 85.0, true));
        studentList.add(new Student("Bob", 21, 75.5, true));
        studentList.add(new Student("Charlie", 19, 92.3, false));

        // print the list of students
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Marks: " +
                    student.getMarks() + ", Required: " + student.isRequired());
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();

        System.out.print("Enter the marks of the student: ");
        double marks = scanner.nextDouble();

        System.out.print("Is the student required (true/false)? ");
        boolean required = scanner.nextBoolean();

        Student searchStudent = new Student(name, age, marks, required);

        boolean contains = studentList.contains(searchStudent);
        boolean containsReference = false;

        for (Student student : studentList) {
            if (student == searchStudent) {
                containsReference = true;
                break;
            }
        }

        System.out.println("The list " + (contains ? "contains" : "does not contain") + " the student object.");
        System.out.println("The search was performed based on " + (containsReference ? "reference." : "content."));

        System.out.print("Enter the index of the student to be removed: ");
        int index = scanner.nextInt();
        studentList.remove(index);

        for (Student s : studentList) {
            System.out.println("Name: " + s.name + ", Age: " + s.age + ", Mark: " + s.marks + ", Required: " + s.required);
        }

        System.out.println("The size of the list is " + studentList.size());

    }
}
