package bai_7.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;
public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }
    }
}
