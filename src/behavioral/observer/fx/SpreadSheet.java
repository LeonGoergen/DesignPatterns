package behavioral.observer.fx;

// Concrete Observer A
public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified!");
    }
}
