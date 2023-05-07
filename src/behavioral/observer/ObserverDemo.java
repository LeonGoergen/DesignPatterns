package behavioral.observer;

import behavioral.observer.fx.Chart;
import behavioral.observer.fx.DataSource;
import behavioral.observer.fx.SpreadSheet;

public class ObserverDemo {
    public static void show () {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
