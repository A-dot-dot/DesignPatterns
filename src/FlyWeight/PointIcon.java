package FlyWeight;

public class PointIcon {
    PointType pointType;
    byte[] icon;

    public PointIcon(PointType pointType, byte[] icon) {
        this.pointType = pointType;
        this.icon = icon;
    }
}
