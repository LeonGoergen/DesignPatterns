package behavioral.visitor.fx;

// Visitor
public interface Operation {
    void apply(HeadingNode header);
    void apply(AnchorNode anchor);
}
