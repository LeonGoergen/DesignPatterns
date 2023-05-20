package structural.adapter.fx.avafilters;

import structural.adapter.fx.Image;

// Adaptee
public class Caramel {
    public void init() {

    }

    public void render (Image image) {
        System.out.println("Applied caramel filter!");
    }

}
