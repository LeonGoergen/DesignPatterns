package creational.abstractfactory.fx.material;

import creational.abstractfactory.fx.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
