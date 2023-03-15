package bai_6.point2d_and_point3d;

import java.util.Scanner;

public class Test3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap toa do x : ");
        float x = scanner.nextFloat();
        System.out.println("nhap toa do y : ");
        float y = scanner.nextFloat();
        System.out.println("nhap toa do z : ");
        float z = scanner.nextFloat();
        Point3D point = new Point3D();
        System.out.println(point);
        point = new Point3D(x, y, z);
        System.out.println(point);
    }
}
