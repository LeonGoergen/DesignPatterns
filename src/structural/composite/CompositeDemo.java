package structural.composite;

import structural.composite.fx.Group;
import structural.composite.fx.Shape;

public class CompositeDemo {
    public static void show(){
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
