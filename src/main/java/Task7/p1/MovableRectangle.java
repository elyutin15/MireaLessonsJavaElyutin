package Task7.p1;

public class MovableRectangle implements Movable{
    MovablePoint leftBottom;
    MovablePoint rightTop;

    public MovableRectangle(MovablePoint leftBottom, MovablePoint rightTop) {
        this.leftBottom = leftBottom;
        this.rightTop = rightTop;
        if (!speedTest()) {
            System.out.println("Speeds arent equals");
        }
    }

    private boolean speedTest() {
        return leftBottom.xSpeed == rightTop.xSpeed && leftBottom.ySpeed == rightTop.ySpeed;
    }

    @Override
    public void up(int time) {
        leftBottom.up(time);
        rightTop.up(time);
    }

    @Override
    public void down(int time) {
        leftBottom.down(time);
        rightTop.down(time);
    }

    @Override
    public void left(int time) {
        leftBottom.left(time);
        rightTop.left(time);
    }

    @Override
    public void right(int time) {
        leftBottom.right(time);
        rightTop.right(time);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "leftBottom=" + leftBottom +
                ", rightTop=" + rightTop +
                '}';
    }
}
