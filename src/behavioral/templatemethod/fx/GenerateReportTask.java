package behavioral.templatemethod.fx;

// Concrete Class B
public class GenerateReportTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Generate Record");
    }
}
