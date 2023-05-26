package creational.abstractfactory.fx.ant;

import creational.abstractfactory.fx.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant Text Box");
    }
}
