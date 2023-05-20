package structural.decorator.fx;

// Decorator A
public class EncryptedCloudStream implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt (String data) {
        return "/!(§!$/(!!§)I#'";
    }
}
