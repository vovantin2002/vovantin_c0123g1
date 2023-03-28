package bai_19;

public class ValidateTenCuaLopHoc {
    public static void main(String[] args) {
        String classname = "[CAP][0-9]{4}[GHIK]";
        String classname1 = "C0223G";
        boolean check = classname1.matches(classname);
        System.out.println(check);
    }
}
