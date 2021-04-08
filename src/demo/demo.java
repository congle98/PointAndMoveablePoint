package demo;

public class demo {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,2,5,8);
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint.move());

    }
}
