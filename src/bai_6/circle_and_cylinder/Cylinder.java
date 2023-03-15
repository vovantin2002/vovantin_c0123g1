package bai_6.circle_and_cylinder;

public class Cylinder extends Circle {
    private int chieuCao=2;
    public Cylinder() {
    }

    public Cylinder(double radius, String color, int chieuCao) {
        super(radius, color);
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double  getTheTich() {
        return getChieuCao()*3.14*(getRadius()*2);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
