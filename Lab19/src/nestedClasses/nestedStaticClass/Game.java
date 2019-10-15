package nestedClasses.nestedStaticClass;

public class Game {
    private final String name = "COD";
    private final GENRE genre = GENRE.ACTION;
    private final TYPE type = TYPE.VIRTUAL;

    public enum TYPE {
        VIRTUAL,
        PHYSICAL
    }

    private Game(String name, GENRE genre, TYPE type) {
    }

    public String getName() {
        return name;
    }

    public GENRE getGenre() {
        return genre;
    }

    public TYPE getType() {
        return type;
    }

    private static class GameDisk {
        private final String description;
        private final Game data;

        public GameDisk(String description, Game data) {
            this.description = description;
            this.data = data;
        }
    }
}
