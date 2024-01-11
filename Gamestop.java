import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

class Gamestop 
{
    	public static void main(String[] args) 
	{
        	List<Integer> customers = new ArrayList<>();
        	customers.add(1);
        	customers.add(2);
        	customers.add(3);
        	System.out.println("Customers List: " + customers);
        	Queue<Integer> playerQueue = new LinkedList<>();
        	playerQueue.add(1);
        	playerQueue.add(2);
        	playerQueue.add(3);
        	System.out.println("Matchmaking Queue: " + playerQueue);
        	Set<Integer> uniquePlayerIds = new HashSet<>();
        	uniquePlayerIds.add(1);
        	uniquePlayerIds.add(2);
        	uniquePlayerIds.add(3);
        	System.out.println("Unique Player IDs Set: " + uniquePlayerIds);
        	
		int select = customers.get(2);
        	System.out.println("Accessed Element: " + select);
        	int removed = customers.remove(1);
        	System.out.println("Removed Element: " + removed);
	}
}
