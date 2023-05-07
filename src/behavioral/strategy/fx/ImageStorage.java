package behavioral.strategy.fx;

// Context
public class ImageStorage {
    public void store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.apply(filename);
    }
}