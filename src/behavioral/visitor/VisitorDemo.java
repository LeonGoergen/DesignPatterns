package behavioral.visitor;

import behavioral.visitor.fx.AnchorNode;
import behavioral.visitor.fx.HeadingNode;
import behavioral.visitor.fx.HtmlDocument;

public class VisitorDemo {
    public static void show () {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.highlight();
    }
}
