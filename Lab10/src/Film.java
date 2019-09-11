/**
 * Film class with basic parameters for movie description
 */
public class Film {
    /*Constant field for Genre - Comedy*/
    final static String GENRE_COMEDY = "comedy";
    /*Constant field for Genre - Fantastic*/
    final static String GENRE_FANTASTIC = "fantastic";
    /*Constant field for Genre - Horror*/
    public final static String GENRE_HORROR = "horror";
    /*Field with name*/
    private String name;
    /*Field with duration of the film*/
    private int duration;
    /*Field with genre*/
    private String genre;

    {
        System.out.println("Создается новый фильм");
    }

    /**
     * Method to get name of the movie
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get duration of movie
     *
     * @return duration of movie
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Method to get genre of movie
     *
     * @return movie genre
     */
    public String getGenre() {

        return genre;
    }

    /**
     * Film constructor with all parameters
     * @param name;
     * @param duration;
     * @param genre;
     */
    Film(String name, int duration, String genre) {

        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм" + name + "успешно создана.");
    }

    /**
     * Method to set name for film
     *
     * @param name;
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set name for film
     *
     * @param duration;
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Method to set name for film
     *
     * @param genre;
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
