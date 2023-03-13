package bai_6.PointAndMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        MoveablePoint moveablePoint = new MoveablePoint(4, 5, 6, 7);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
