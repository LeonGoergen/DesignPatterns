package structural.flyweight;

import structural.flyweight.fx.PointIconFactory;
import structural.flyweight.fx.PointService;

public class FlyweightDemo {
    public static void show () {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}
