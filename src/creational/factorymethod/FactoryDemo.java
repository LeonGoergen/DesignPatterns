package creational.factorymethod;

import creational.factorymethod.fx.ProductsController;

public class FactoryDemo {
    public static void show () {
        new ProductsController().listProducts();
    }
}
