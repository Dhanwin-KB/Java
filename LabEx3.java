import java.util.*;
public class Gaming
{
	static abstract class Game 
	{
    		private String title;
    		private double price;
    		public Game(String title, double price)
		{
        		this.title = title;
        		this.price = price;
    		}
    		public abstract void display();
    		public String Title() 
		{
        		return title;
    		}
    		public double Price() 
		{
        		return price;
    		}
	}	
	static final class RDR2 extends Game 
	{
    		public RDR2(double price) 
		{
        		super("Red Dead Redemption 2", price);
    		}
    		public void display() 
		{
        		System.out.println("Title: " + Title());
        		System.out.println("Price: " + Price());
    		}
	}
	public static void main(String[] args) 
	{
		Gaming gaming = new Gaming();
        	RDR2 rdr2 = new RDR2(49.99);
        	rdr2.display();
    	}
}