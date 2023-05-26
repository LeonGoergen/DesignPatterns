package creational.abstractfactory.fx.material;

import creational.abstractfactory.fx.Button;
import creational.abstractfactory.fx.TextBox;
import creational.abstractfactory.fx.WidgetFactory;

// Concrete Factory A
public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
