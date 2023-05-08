package behavioral.visitor.fx;

// Concrete Element A
public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
