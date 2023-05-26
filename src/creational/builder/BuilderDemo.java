package creational.builder;

import creational.builder.fx.MovieBuilder;
import creational.builder.fx.PdfDocumentBuilder;
import creational.builder.fx.Presentation;
import creational.builder.fx.Slide;

public class BuilderDemo {
    public static void show () {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        var pdf = builder.getPdfDocument();

        var builder2 = new MovieBuilder();
        presentation.export(builder2);
        var movie = builder2.getMovie();
    }
}
