package behavioral.strategy;

// Concrete Strategy 1 A
public class PngCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using PNG");
    }
}
