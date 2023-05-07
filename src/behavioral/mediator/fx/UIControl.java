package behavioral.mediator.fx;

// Colleague
public class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
