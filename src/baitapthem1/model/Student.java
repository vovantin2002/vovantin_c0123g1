package baitapthem1.model;

public class Student extends Person {
    private String cls;
    private double grade;

    public Student(String id, String name, String dob, String gender, String cls, double grade) {
        super(id, name, dob, gender);
        this.cls = cls;
        this.grade = grade;
    }

    public String getCls() {
        return cls;
    }

    public double getGrade() {
        return grade;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Class: " + cls);
        System.out.println("Grade: " + grade);
    }
}
