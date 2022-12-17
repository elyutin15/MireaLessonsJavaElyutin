package Task7.p1;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public void up(int time) {
        y += time * ySpeed;
    }

    @Override
    public void down(int time) {
        y -= time * ySpeed;
    }

    @Override
    public void left(int time) {
        x -= time * xSpeed;
    }

    @Override
    public void right(int time) {
        x += time * xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
