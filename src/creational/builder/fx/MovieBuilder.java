package creational.builder.fx;

// Concrete Builder B
public class MovieBuilder implements PresentationBuilder {
    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }

    public Movie getMovie() {
        return movie;
    }
}
