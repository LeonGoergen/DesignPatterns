package memento;

public class MementoDemo {
    public static void show () {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a"); // current state -> "a", history -> null
        history.push(editor.createState()); // current state -> "a", history -> "a"

        editor.setContent("b"); // current state -> "b", history -> "a"
        history.push(editor.createState()); // current state -> "a", history -> "a", "b"

        editor.setContent("c"); // current state -> "c", history -> "a", "b"
        System.out.println(editor.getContent());

        editor.restore(history.pop()); // current state -> "b", history -> "a"
        System.out.println(editor.getContent());

        editor.restore(history.pop()); // current state -> "a", history -> null
        System.out.println(editor.getContent());
    }
}
