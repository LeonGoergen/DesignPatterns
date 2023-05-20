package structural.decorator;

import structural.decorator.fx.CloudStream;
import structural.decorator.fx.CompressedCloudStream;
import structural.decorator.fx.EncryptedCloudStream;
import structural.decorator.fx.Stream;

public class DecoratorDemo {
    public static void show () {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
