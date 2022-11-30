package streams;

public class MovieWithGenre {
    private final String title;
    private final int likes;
    private final Genre genre;

    public MovieWithGenre(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title;
    }
}
