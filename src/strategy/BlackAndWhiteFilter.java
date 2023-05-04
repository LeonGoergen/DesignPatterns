package strategy;

// Concrete Strategy 2 B
public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Applying Black and White Filter");
    }
}
