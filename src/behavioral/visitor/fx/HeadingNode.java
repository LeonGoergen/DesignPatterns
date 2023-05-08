package behavioral.visitor.fx;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight Header");
    }
}
