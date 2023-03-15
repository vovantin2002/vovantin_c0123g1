package bai_6.point_and_moveable_point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(1, 2);
        System.out.println(point);
        MoveablePoint movablePoint = new MoveablePoint();
        System.out.println(movablePoint);
        movablePoint = new MoveablePoint(3, 4, 5, 6);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
