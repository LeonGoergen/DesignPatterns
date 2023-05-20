package structural.adapter;

import structural.adapter.fx.CaramelFilter;
import structural.adapter.fx.Image;
import structural.adapter.fx.ImageView;
import structural.adapter.fx.VividFilter;
import structural.adapter.fx.avafilters.Caramel;

public class AdapterDemo {
    public static void show () {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
