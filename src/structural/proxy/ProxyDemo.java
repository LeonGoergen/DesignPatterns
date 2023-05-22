package structural.proxy;

import structural.proxy.fx.EbookProxy;
import structural.proxy.fx.Library;
import structural.proxy.fx.LoggingEbookProxy;
import structural.proxy.fx.RealEbook;

// Client
public class ProxyDemo {
    public static void show () {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
    }
}
