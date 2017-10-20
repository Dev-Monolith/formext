import java.util.Scanner;

public class HelloWorld
{
	private static String[] messages = {"Tu as ", " ans"};
	
	public static void main(String[] args)
	{
		//R�cup�ration de l'�ge au clavier
		System.out.println("Quel est ton age ? ");
		Scanner clavierStd = new Scanner(System.in);
		int age = clavierStd.nextInt();
		
		//Affichage du message et de l'�ge en parcourant le tableau
		for(int i = 0; i < messages.length; i++)
		{
			//V�rification vrai si indice impair
			if(i%2 == 1)
				System.out.print(age);
			
			System.out.print(messages[i]);
		}
		
		//Op�ration ternaire sur l'�ge adulte, adoescent ou enfant
		System.out.print((age >= 18 ? ", tu es un adulte" : (age < 13 ? ", tu es un enfant" : ", tu es un(e) adolescent(e)")));
	}
}