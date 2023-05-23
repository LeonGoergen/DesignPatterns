package creational.prototype.fx;

// Client
public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
    }
}
