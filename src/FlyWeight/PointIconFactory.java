package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    static Map<PointType, PointIcon> pool = new HashMap();

    static PointIcon getPointIcon(PointType pointType) {
        if(!pool.containsKey(pointType)) {
            pool.put(pointType, new PointIcon(pointType, getIcon(pointType)));
        }

        return pool.get(pointType);
    }

    private static byte[] getIcon(PointType pointType) {
        switch (pointType) {
            case CAFE -> {
                System.out.println("Created new CAFE Icon.");
                return new byte[20];
            }
            case HOSPITAL -> {
                System.out.println("Created new HOSPITAL Icon.");
                return new byte[20];
            }
            case SCHOOL -> {
                System.out.println("Created new SCHOOL Icon.");
                return new byte[20];
            }
            default -> {
                System.out.println("Created UNKNOWN Icon.");
                return new byte[20];
            }
        }
    }
}
