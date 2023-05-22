package structural.proxy.fx;

// Real Subject A
public class RealEbook implements Ebook {
    private String filename;

    public RealEbook(String filename) {
        this.filename = filename;
        load();
    }

    private void load () {
        System.out.println("Loading the E-Book " + filename);
    }

    @Override
    public void show() {
        System.out.println("Showing the E-Book " + filename);
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
