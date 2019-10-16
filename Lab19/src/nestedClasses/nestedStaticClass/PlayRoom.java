package nestedClasses.nestedStaticClass;

import nestedClasses.nestedInnerClass.GameConsole;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk[] gameDisks = new Game.GameDisk[]{};
        gameDisks[0] = Game.getGameDisk("DIABLO", GENRE.ACTION, "RPG");
        gameDisks[1] = Game.getGameDisk("NEED FOR SPEED", GENRE.RACE, "PUSHKA GONKA");
        gameDisks[2] = Game.getGameDisk("SImCIty", GENRE.STRATEGY, "Build your city");
        gameDisks[3] = Game.getGameDisk("PRO EVOLUTION SOCCER", GENRE.SPORT, "FOOTBALL SIMULATOR");
        Game.VirtualGame[] virtualGames = new Game.VirtualGame[]{};
        virtualGames[0] = Game.getVirtualGame("Abc", GENRE.ACTION);
        virtualGames[1] = Game.getVirtualGame("NBA", GENRE.SPORT);
        virtualGames[2] = Game.getVirtualGame("Red alert 2", GENRE.STRATEGY);
        virtualGames[3] = Game.getVirtualGame("XZ", GENRE.RACE);
        GameConsole gameConsole = new GameConsole("SONY", "DW12SSr23");

    }
}
