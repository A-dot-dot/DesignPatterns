package FlyWeight;

public class Client {
    public static void main(String[] args) {
        PointService pointService = new PointService();

        for(Point p : pointService.getPoints()) {
            p.draw();
        }
    }
}
