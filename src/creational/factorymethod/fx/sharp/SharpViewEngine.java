package creational.factorymethod.fx.sharp;

import creational.factorymethod.fx.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
