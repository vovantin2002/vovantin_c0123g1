package bai_tap_them.molel;

public class Person {
    private int code;
    private String birth;
    private String gender;
    private String name;

    public Person() {
    }

    public Person(int code, String birth, String gender, String name) {
        this.code = code;
        this.birth = birth;
        this.gender = gender;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Peron{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birth='" + getBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
