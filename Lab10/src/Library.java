/**
 * Pattern for library of the movies
 */
public class Library {
    /*Field with library name*/
    private final String LIBRARY_NAME;
    /*Initializing array with size 6 of free cells*/
    private static Film[] films = new Film[5];

    {
        films[0] = new Film("Film3", 96, Film.GENRE_COMEDY);
        films[1] = new Film("Film4", 85, Film.GENRE_FANTASTIC);
        System.out.println("Добавлены любимые фильмы");
    }

    /*Getter which returning name of the library*/
    public String getLIBRARY_NAME() {
        return LIBRARY_NAME;
    }

    /*Getter which returning array of the library*/
    static Film[] getFilms() {
        return films;
    }

    Library(String library_name) {
        LIBRARY_NAME = library_name;
        System.out.println("Библиотека " + LIBRARY_NAME + ", успешно создана");
    }


}
