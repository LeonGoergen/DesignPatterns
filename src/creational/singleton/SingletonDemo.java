package creational.singleton;

import creational.singleton.fx.ConfigManager;

public class SingletonDemo {
    public static void show () {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("Name", "Leon");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("Name"));
    }
}
