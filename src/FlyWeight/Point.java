package FlyWeight;

public class Point {
    int x;
    int y;

    PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void draw() {
        System.out.printf("Drawing a %s at (%d, %d)", pointIcon.pointType.toString(), x, y);
        System.out.println();
    }
}
