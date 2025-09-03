package lab_4;
import java.util.Scanner;
import java.util.ArrayList;
public class lab_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		int count = 0;
		int min = 2147483647;
		int max = -2147483647;
		int avg = 0;
		System.out.println("Input: ");
		System.out.println("");
		for (int i = 0; i < 10; i++)
		{	
			input[i] = scan.nextInt();
		}
		for (int d = 0; d < 10; d++)	
		{
			if (input[d] % 3 == 0)
			{
				System.out.print(input[d] + ", ");
			}
			
		}
		System.out.println("are divisible by 3.");
		for (int k = 0; k < input.length; k++)
		{
			if (input[k] % 2 == 0)
			{
				count++;
			}
		}
		System.out.println("There are " + count + " even numbers.");
		for (int a = 0; a < input.length; a++)
		{
			if (input[a] < min)
			{
				min = input[a];
			}
		}
		System.out.println("Minimium = " + min);
		for (int b = 0; b < input.length; b++)
		{
			if (input[b] > max)
			{
				max = input[b];
			}
		}
		System.out.println("Maximum = " + max);
		for (int c = 0; c < input.length; c++)
		{
			avg += input[c];
		}
		System.out.println("Sum = " + avg);
		avg /= 10;
		System.out.println("Average = " + avg);
		String dig = String.valueOf(max);
		System.out.println("Largest digits:");
		for (int g = 0; g < dig.length(); g++)
		{
			System.out.println(dig.substring(g, g + 1));
		}
	}
}
