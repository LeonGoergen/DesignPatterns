package behavioral.memento;

import behavioral.memento.fx.Editor;
import behavioral.memento.fx.History;

public class MementoDemo {
    public static void show () {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a"); // current behavioral.state -> "a", history -> null
        history.push(editor.createState()); // current behavioral.state -> "a", history -> "a"

        editor.setContent("b"); // current behavioral.state -> "b", history -> "a"
        history.push(editor.createState()); // current behavioral.state -> "a", history -> "a", "b"

        editor.setContent("c"); // current behavioral.state -> "c", history -> "a", "b"
        System.out.println(editor.getContent());

        editor.restore(history.pop()); // current behavioral.state -> "b", history -> "a"
        System.out.println(editor.getContent());

        editor.restore(history.pop()); // current behavioral.state -> "a", history -> null
        System.out.println(editor.getContent());
    }
}
