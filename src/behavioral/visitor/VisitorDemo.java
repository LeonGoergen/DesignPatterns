package behavioral.visitor;

import behavioral.visitor.fx.*;

public class VisitorDemo {
    public static void show () {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
