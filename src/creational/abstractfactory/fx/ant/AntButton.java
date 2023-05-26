package creational.abstractfactory.fx.ant;

import creational.abstractfactory.fx.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
