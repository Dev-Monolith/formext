import java.util.Scanner;

public class HelloWorld
{
	private static String[] messages = {"Tu as ", " ans"};
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Quel est ton age ? ");
		
		int age = sc.nextInt();
		
		System.out.print(messages[0] + age + messages[1]);
	}
}
