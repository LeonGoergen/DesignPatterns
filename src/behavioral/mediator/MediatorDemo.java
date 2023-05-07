package behavioral.mediator;

import behavioral.mediator.fx.ArticlesDialogBox;

public class MediatorDemo {
    public static void show () {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
