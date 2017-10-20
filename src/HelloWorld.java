import java.util.Scanner;

public class HelloWorld
{
	private static String[] messages = {"Tu as ", " ans"};
	
	public static void main(String[] args)
	{
		//Récupération de l'âge au clavier
		System.out.println("Quel est ton age ? ");
		Scanner clavierStd = new Scanner(System.in);
		int age = clavierStd.nextInt();
		
		//Affichage du message et de l'âge en parcourant le tableau
		for(int i = 0; i < messages.length; i++)
		{
			//Vérification vrai si indice impair
			if(i%2 == 1)
				System.out.print(age);
			
			System.out.print(messages[i]);
		}
		
		//Opération ternaire sur l'âge adulte, adoescent ou enfant
		System.out.print((age >= 18 ? ", tu es un adulte" : (age < 13 ? ", tu es un enfant" : ", tu es un(e) adolescent(e)")));
	}
}