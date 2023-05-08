package behavioral.visitor.fx;

// Concrete Visitor B
public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode header) {
        System.out.println("Highlight Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Hightlight Anchor");
    }
}
