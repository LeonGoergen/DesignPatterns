package creational.prototype;

import creational.prototype.fx.Circle;
import creational.prototype.fx.Component;

public class PrototypeDemo {
    public static void show () {
        Component circle1 = new Circle();
        circle1.render();

        Component circle2 = circle1.clone();
        circle2.render();
    }
}
