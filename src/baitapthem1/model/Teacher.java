package baitapthem1.model;

public class Teacher extends Person {
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
