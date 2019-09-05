/**
 * Created by Brainacad2 on 04.09.2019.
 */
public class Library
{
    private final String libraryName;
    private Film[] films = new Film[5];

    {
        films[0] = new Film("Film3", 96, Film.GENRE_COMEDY);
        films[1] = new Film("Film4", 85, Film.GENRE_FANTASTIC);
        System.out.println("Добавлены любимые фильмы");
    }

    public Library(String libraryName, Film[] films)
    {
        this.libraryName = libraryName;
        this.films = films;
        System.out.println("Библиотека " + libraryName + ", успешно создана");
    }

    public String getLibraryName()
    {
        return libraryName;
    }

    public Film[] getFilms()
    {
        return films;
    }

    public int libraryIsEmpty()
    {
        for (int i = 0; i < films.length; i++)
        {
        if (libraryName.isEmpty()){
            return i;
        }
        }
        return -1;
    }
}
