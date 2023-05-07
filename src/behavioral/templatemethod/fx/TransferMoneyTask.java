package behavioral.templatemethod.fx;

// Concrete Class A
public class TransferMoneyTask extends Task{
    @Override
   protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
