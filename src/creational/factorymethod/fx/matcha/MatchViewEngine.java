package creational.factorymethod.fx.matcha;

import creational.factorymethod.fx.ViewEngine;

import java.util.Map;

public class MatchViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Matcha!";
    }
}
