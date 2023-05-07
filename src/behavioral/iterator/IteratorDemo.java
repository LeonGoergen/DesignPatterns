package behavioral.iterator;

import behavioral.iterator.fx.BrowserHistory;
import behavioral.iterator.fx.Iterator;

public class IteratorDemo {
    public static void show () {
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
