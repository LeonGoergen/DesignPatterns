package behavioral.memento.fx;

// Originator
public class Editor {
    private String content;
    private String oldContent;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.oldContent = this.content;
        this.content = content;
    }

}
