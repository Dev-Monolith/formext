import java.util.Scanner;

public class HelloWorld
{
	private static String[] messages = {"Tu as ", " ans"};
	
	public static void main(String[] args)
	{
		//R�cup�ration de l'�ge au clavier
		System.out.println("Quel est ton age ? ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		//Affichage du message et l'�ge en parcourant le tableau
		for(int i = 0; i < messages.length; i++)
		{
			//V�rification des indices impairs
			if(i%2 == 1)
				System.out.print(age);
			
			System.out.print(messages[i]);
		}
	}
}