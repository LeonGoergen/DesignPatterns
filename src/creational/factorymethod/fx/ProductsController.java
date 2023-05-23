package creational.factorymethod.fx;

import creational.factorymethod.fx.matcha.Controller;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        // Get products from database
        Map<String, Object> context = new HashMap<>();
        // context.put(...)
        render("products.html", context);
    }
}
