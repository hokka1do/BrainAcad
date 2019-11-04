package nestedClasses.nestedStaticClass;

public class Game {
    final String name;
    final GENRE genre;
    final TYPE type;

    public enum GENRE {
        ACTION,
        RACE,
        SPORT,
        STRATEGY
    }

    public enum TYPE {
        VIRTUAL,
        PHYSICAL
    }

    public Game(String name, GENRE genre, TYPE type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
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

    public static class GameDisk {
        private final String description;
        private final Game data;
        GENRE genre;

        private GameDisk(String name, GENRE genre, String description) {
            this.description = description;
            this.data = new Game(name, genre, TYPE.PHYSICAL);
        }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }

        public GENRE getGenre() {
            return genre;
        }
    }

    public static class VirtualGame {
        private int rating;
        private final Game data;

        private VirtualGame(String name, GENRE genre) {
            this.data = new Game(name, genre, TYPE.VIRTUAL);
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            if (rating < 0 || rating > 5) return;
            this.rating = rating;
        }

        public Game getData() {
            return data;
        }
    }

    public static GameDisk getGameDisk(String name, GENRE genre, String description) {
        return new GameDisk(name, genre, description);
    }

    public static VirtualGame getVirtualGame(String name, GENRE genre) {
        return new VirtualGame(name, genre);
    }
}
