package templatemethod;

public class TemplateMethodDemo {
    public static void show() {
        var moneyTask = new TransferMoneyTask();
        moneyTask.execute(); // Method "doExecute" should not be visible, but all classes are in the same package which is why protected doesnt work

        var  reportTask = new GenerateReportTask();
        reportTask.execute(); // same for this
    }
}
