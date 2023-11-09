import java.util.Scanner;
public class LabEx2_1
{
	public static void main(String args[])
	{
		String tata = "We realize that while our workers were thriving the surrounding villages were still suffering.It became our goal to uplift their quality of life as well.I remember seeing a family of 4 on a motorbike in the heavy Bombay rain.I knew I wanted to do more for these families who were risking their lives for lack of an alternative.The alternative mentioned here is the Tata Nano which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh.These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";
		String sign = " ~ Tata";
		System.out.println(tata);
		System.out.println("charAt() : " + tata.charAt(0) + tata.charAt(1));
		if(tata.compareTo(sign)==0)
		{
			System.out.println("compareTo() : The strings are equal");
		}
		else
		{
			System.out.println("compareTo() : The strings are not equal");
		}
		String concatenated = tata.concat(sign);
		System.out.println("concat() : \n" + concatenated);
		System.out.println("contains() : " + tata.contains("Tata Nano"));
		System.out.println("concatenated.endsWith(Tata) : " + tata.endsWith("Tata"));
		System.out.println("concatenated.endsWith(Nano) : " + tata.endsWith("Nano"));
		String tatacopy = "We realize that while our workers were thriving the surrounding villages were still suffering.It became our goal to uplift their quality of life as well.I remember seeing a family of 4 on a motorbike in the heavy Bombay rain.I knew I wanted to do more for these families who were risking their lives for lack of an alternative.The alternative mentioned here is the Tata Nano which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh.These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";
		System.out.println("equals() : " + tata.equals(concatenated));
		System.out.println("equals() : " + tata.equals(tatacopy));
		System.out.println("equalsIgnoreCase() : " + tata.equalsIgnoreCase(concatenated));
		System.out.println("equalsIgnoreCase() : " + tata.equalsIgnoreCase(tatacopy));
		String insert=String.format("This article has been supervised by%s",sign);
		System.out.println("format() : " + tata.format(insert));
		byte[] bytes = sign.getBytes();
		char[] ch = new char[50];
		System.out.println("getBytes() : " + bytes);
		sign.getChars(0, 5, ch, 0);
		System.out.println("getChars() : " + ch);
		System.out.println("indexOf() : " + tata.indexOf("Nano"));
		String intrcopy=tata.intern();
		System.out.println("intern() : " + (tata == intrcopy));
		System.out.println("isEmpty() : " + intrcopy.isEmpty());
		String str = String.join("", "ra", "tata", "ta");
		System.out.println("join() : " + str);
		int index = tata.lastIndexOf("Tata"); 
		System.out.println("lastIndexOf(Tata) : " + index);
		int length = tata.length(); 
		System.out.println("length() : " + length);
		String newTata = tata.replace('a', 'e');
		System.out.println("replace(a, e) : " + newTata);
		String newTata2 = tata.replaceAll("\\d", "*"); 
		System.out.println("replaceAll(\\d, *) : " + newTata2);
		String[] words = tata.split("\\."); 
		System.out.println("split(\\.) : " + words);
		boolean starts = tata.startsWith("We"); 
		System.out.println("startsWith(We) : " + starts);
		String part = tata.substring(10, 20); 
		System.out.println("substring(10, 20) : " + part);
		char[] chars = tata.toCharArray();
		System.out.println("toCharArray() : " + chars);
		String lower = tata.toLowerCase(); 
		System.out.println("toLowerCase() : " + lower);
		String upper = tata.toUpperCase(); 
		System.out.println("toUpperCase() : " + upper);
		String trimmed = tata.trim(); 
		System.out.println("trim() : " + trimmed);
		String value = String.valueOf(100); 
		System.out.println("valueOf(100) : " + value);
	}
}
