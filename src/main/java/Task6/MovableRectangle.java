package Task6;

import Task6.application.Movable;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    public MovableRectangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x, y, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public static boolean compareSpeed(MovablePoint a, MovablePoint b) {
        return a.getXSpeed() == b.getXSpeed()
                && a.getYSpeed() == b.getYSpeed();
    }
}
