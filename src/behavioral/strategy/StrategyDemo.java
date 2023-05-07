package behavioral.strategy;

public class StrategyDemo {
    public static void show() {
        var imageStorage = new ImageStorage();

        imageStorage.store("filename",
                new JpegCompressor(),
                new BlackAndWhiteFilter());
        imageStorage.store("filename2",
                new PngCompressor(),
                new BlackAndWhiteFilter());
    }
}
