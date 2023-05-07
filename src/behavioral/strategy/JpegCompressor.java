package behavioral.strategy;

// Concrete Strategy 1 B
public class JpegCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using JPEG");
    }
}
