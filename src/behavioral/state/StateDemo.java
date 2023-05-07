package behavioral.state;

import behavioral.state.fx.Canvas;
import behavioral.state.fx.SelectionTool;

public class StateDemo {
    public static void show() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
