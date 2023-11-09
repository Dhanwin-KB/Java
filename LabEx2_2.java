import java.util.*;
public class LabEx2_2
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("DeeKayBees");
		System.out.println("String Buffer : " + sb);
		sb.append(" World");
		sb.insert(16, " has come to an end");
		System.out.println("String Buffer : " + sb);
		System.out.println("Sorry!");
		sb.replace(16, 35, " has not come to an end");
		System.out.println("String Buffer : " + sb);
		sb.delete(11, 17);
		System.out.println("String Buffer (after deletion) : " + sb);
		System.out.println("The character at the 5th position is: " + sb.charAt(5));
		sb.setCharAt(5, '!');
		System.out.println("The length of the string is: " + sb.length());
		System.out.println("The current capacity of the string is: " + sb.capacity());
		sb.ensureCapacity(65);
		System.out.println("The new capacity of the string is: " + sb.capacity());
		String s = sb.toString();
		System.out.println("The substring from the 6th position : " + s.substring(6));
		System.out.println("The substring from the 6th to the 10th position : " + s.substring(6, 10));
	}
}