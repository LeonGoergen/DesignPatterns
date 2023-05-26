package creational.abstractfactory;

import creational.abstractfactory.fx.ant.AntWidgetFactory;
import creational.abstractfactory.fx.app.ContactForm;
import creational.abstractfactory.fx.material.MaterialWidgetFactory;

public class AbstractFactoryDemo {
    public static void show () {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
