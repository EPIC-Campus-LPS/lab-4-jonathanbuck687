package lab_4;
import java.util.Scanner;
public class lab_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		String str = scan.nextLine();
		String fruits = "";
		int count = 0;
		boolean and = false;
		String rev = "";
		for (int i = 0; i < str.length(); i++)
		{
			if (str.length() >= 5 + i)
			{
				if (str.substring(i, i + 5).equals("apple"))
				{
					fruits += "apple, ";
				}
			}
			if (str.length() >= 6 + i)
			{
				if (str.substring(i, i + 6).equals("banana"))
				{
					fruits += "banana, ";
				}
			}
			if (str.length() >= 6 + i)
			{
				if (str.substring(i, i + 6).equals("cherry"))
				{
					fruits += "cherry, ";
				}
			}
			if (str.length() >= 3 + i)
			{
				if (str.substring(i, i + 3).equals("the"))
				{
					count++;
				}
			}
			if (str.length() >= 3 + i)
			{
				if (str.substring(i, i + 3).equals("and"))
				{
					and = true;
				}
			}
			
		}
		for (int j = str.length(); j > 0; j--)
		{
			rev += str.substring(j - 1, j);
		}
		System.out.println("Found: " + fruits);
		System.out.println("The: \"the\" appears " + count + " times.");
		if (and)
		{
			System.out.println("And: appears.");
		}
		else
		{
			System.out.println("And: doesn't appear.");
		}
		System.out.println("Reverse: " + rev);
		
	}

}
