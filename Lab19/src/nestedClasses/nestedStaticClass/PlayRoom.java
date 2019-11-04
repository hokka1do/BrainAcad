package nestedClasses.nestedStaticClass;

import nestedClasses.nestedInnerClass.GameConsole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayRoom {
    public static void main(String[] args) {
        List<Game.GameDisk> gameDisks = new ArrayList<>();
        gameDisks.add(Game.getGameDisk("DIABLO", Game.GENRE.ACTION, "RPG"));
        gameDisks.add(Game.getGameDisk("NEED FOR SPEED", Game.GENRE.RACE, "PUSHKA GONKA"));
        gameDisks.add(Game.getGameDisk("SImCIty", Game.GENRE.STRATEGY, "Build your city"));
        gameDisks.add(Game.getGameDisk("PRO EVOLUTION SOCCER", Game.GENRE.SPORT, "FOOTBALL SIMULATOR"));
        List<Game.VirtualGame> virtualGames = new ArrayList<>();
        virtualGames.add(Game.getVirtualGame("Abc", Game.GENRE.ACTION));
        virtualGames.add(Game.getVirtualGame("NBA", Game.GENRE.SPORT));
        virtualGames.add(Game.getVirtualGame("Red alert 2", Game.GENRE.STRATEGY));
        virtualGames.add(Game.getVirtualGame("XZ", Game.GENRE.RACE));
        virtualGames.get(0).setRating(3);
        virtualGames.get(1).setRating(2);
        virtualGames.get(2).setRating(5);
        virtualGames.get(3).setRating(4);
        GameConsole gameConsole = new GameConsole("SONY", "DW12SSr23");
        gameConsole.setOn(true);
        Collections.sort(gameDisks, Comparator.comparing(o -> o.getData().getGenre()));
        for (Game.GameDisk games : gameDisks) {
            System.out.println(games.getData().name + " - Genre is : " +games.getData().getGenre());
        }
        Collections.sort(virtualGames, Comparator.comparing(Game.VirtualGame::getRating));
        for (Game.VirtualGame games : virtualGames) {
            System.out.println(games.getData().name + " - rating is : " +games.getRating());
        }
    }
}
