package behavioral.visitor.fx;

// Concrete Visitor A
public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode header) {
        System.out.println("Text Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Text Anchor");
    }
}
