package creational.singleton.fx;

import java.util.HashMap;
import java.util.Map;

// Singleton
public class ConfigManager {
    private final Map<String, Object> settings = new HashMap<>();
    private final static ConfigManager instance = new ConfigManager();

    private ConfigManager() {} // private Constructor does not allow new instances to be created

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}
