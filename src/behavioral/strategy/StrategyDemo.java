package behavioral.strategy;

import behavioral.strategy.fx.BlackAndWhiteFilter;
import behavioral.strategy.fx.ImageStorage;
import behavioral.strategy.fx.JpegCompressor;
import behavioral.strategy.fx.PngCompressor;

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
