public class HelloWorld
{
	private static String[] messages = {"Bonjour ", "à tous"};
	
	public static void main(String[] args)
	{
		for(int i = 0; i < messages.length; i++)
		{
			System.out.print(messages[i]);
		}
		
		System.out.println();
		
		for(String m : messages)
		{
			System.out.print(m);
		}
	}
}
