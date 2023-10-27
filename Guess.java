import java.util.Scanner;
public class Guess 
{
    	public static void main(String[] args) 
	{
        	int guess,trials;
        	Scanner sc = new Scanner(System.in);

        	int max = 10;
        	int min = 1;
        	int range = max - min + 1;
        	int randomno = (int) (Math.random() * range) + min;
		
		trials=0;
		do
		{
			System.out.println("################ TRIAL " + (trials+1) + " ################");
			System.out.println("Enter the number you're guessing is the randomly generated number:");
        		guess = sc.nextInt();
        		if (guess == randomno) 
			{
            			System.out.println("Your guess was right!");
            			System.out.println(guess + " equals " + randomno);
				break;
        		} 
			else if (guess > randomno) 
			{
            			System.out.println("The number you guessed was greater than the generated number!\n");
        		} 
			else if (guess < randomno) 
			{
            			System.out.println("The number you guessed was smaller than the generated number!\n");
        		} 
			else 
			{
            			System.out.println("Please enter a valid number\n");
        		}
			trials++;
		}while(trials<5);
    	}
}
