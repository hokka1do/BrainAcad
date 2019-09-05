/**
 * Created by Brainacad2 on 04.09.2019.
 */
public class Film
{
    public final static String GENRE_COMEDY = "comedy";
    public final static String GENRE_FANTASTIC = "fantastic";
    public final static String GENRE_HORROR = "horror";
    private String name;
    private int duration;
    private String genre;

    {
        System.out.println("Создается новый фильм");
    }

    public String getName()
    {
        return name;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getGenre()
    {

        return genre;
    }



    public Film(String name, int duration, String genre)
    {

        this.name = name;
        this.duration = duration;
        this.genre = genre;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
