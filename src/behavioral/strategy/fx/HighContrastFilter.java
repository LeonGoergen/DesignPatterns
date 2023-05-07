package behavioral.strategy.fx;

// Concrete Strategy 2 A
public class HighContrastFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Applying High Contrast Filter");
    }
}
