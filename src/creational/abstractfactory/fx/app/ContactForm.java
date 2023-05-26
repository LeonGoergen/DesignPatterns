package creational.abstractfactory.fx.app;

import creational.abstractfactory.fx.WidgetFactory;

public class ContactForm {
    public void render (WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
