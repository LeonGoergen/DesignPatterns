package creational.abstractfactory.fx.ant;

import creational.abstractfactory.fx.Button;
import creational.abstractfactory.fx.TextBox;
import creational.abstractfactory.fx.WidgetFactory;

// Concrete Factory B
public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
