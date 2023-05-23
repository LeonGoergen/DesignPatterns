package creational.factorymethod.fx.sharp;

import creational.factorymethod.fx.matcha.Controller;
import creational.factorymethod.fx.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
