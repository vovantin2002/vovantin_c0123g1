package baitapthem1;

public class Person {
    private String id;
    private String name;
    private String dob;
    private String gender;

    public Person(String id, String name, String dob, String gender) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
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

class Teacher extends Person {
    private String expertise;

    public Teacher(String id, String name, String dob, String gender, String expertise) {
        super(id, name, dob, gender);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expertise: " + expertise);
    }
}

