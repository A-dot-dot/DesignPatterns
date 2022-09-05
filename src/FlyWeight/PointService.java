package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    List<Point> points;

    public PointService() {
        points = new ArrayList();
        init();
    }

    private void init() {
        // Add some points.
        Point point1 = new Point(1, 1, PointIconFactory.getPointIcon(PointType.CAFE));
        Point point2 = new Point(2, 2, PointIconFactory.getPointIcon(PointType.HOSPITAL));
        Point point3 = new Point(3, 3, PointIconFactory.getPointIcon(PointType.SCHOOL));
        Point point4 = new Point(4, 4, PointIconFactory.getPointIcon(PointType.CAFE));

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    List<Point> getPoints() {
        return points;
    }
}
