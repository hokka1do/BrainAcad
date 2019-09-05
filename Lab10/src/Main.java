/**
 * Created by Brainacad2 on 04.09.2019.
 */
public class Main
{
    public static void main(String[] args)
    {
        Library library1 = new Library("Library1", new Film[3]);

        if (library1.libraryIsEmpty() != -1)
        {
            new Film("Film5",54,"horror");
        }
    }
}
