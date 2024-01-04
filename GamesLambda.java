import java.util.ArrayList;
import java.util.List;
interface Label 
{
    void show();
}
public class GamesLambda 
{
	public static void main(String[] args) 
	{
        	Label isGame = () -> System.out.println("Game");
        	Label isConsole = () -> System.out.println("Console");
        	isGame.show();
        	isConsole.show();
    	}
}
