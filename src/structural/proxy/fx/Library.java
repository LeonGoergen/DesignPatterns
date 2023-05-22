package structural.proxy.fx;

import java.util.HashMap;
import java.util.Map;

// Client
public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add (Ebook ebook) {
        ebooks.put(ebook.getFilename(), ebook);
    }

    public void openEbook (String fileName) {
        ebooks.get(fileName).show();
    }
}
