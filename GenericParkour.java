import java.util.*;
public class GenericParkour 
{    
	public static class GameStore<T extends Games> 
	{
        	private List<T> gamesList = new ArrayList<>();
        	public void addGame(T game)
		{
            		gamesList.add(game);
        	}
        	public void printGameInfo() 
		{
            		gamesList.forEach(game -> System.out.println(game));
        	}
    	}
    	public interface Games 
	{
        	String getName();
        	void play();
    	}
	public static class Game implements Games 
	{
        	private String name;
        	public Game(String name) 
		{
            		this.name = name;
        	}
        	public String getGame() 
		{
            		return name;
        	}
        	public void play() 
		{
			System.out.println("Playing " + name);
		}
        	public String toString() 
		{
			return "Game: " + name;
        	}
	}
	public static void main(String[] args) 
	{
        	GameStore<Game> gameStore = new GameStore<>();
        	gameStore.addGame(new Game("RDR2"));
        	gameStore.addGame(new Game("God of War"));
        	gameStore.addGame(new Game("Assassin's Creed"));
        	gameStore.printGameInfo();
    	}
}
