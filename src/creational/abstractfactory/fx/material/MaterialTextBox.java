package creational.abstractfactory.fx.material;

import creational.abstractfactory.fx.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material Text Box");
    }
}
