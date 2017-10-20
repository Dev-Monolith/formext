import java.util.Scanner;

public class HelloWorld
{
	private static String[] messages = {"Tu as ", " ans"};

	public static void exManipulationTableau()
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
	
	public static void main(String[] args)
	{
//		exManipulationTableau();
		

		String dateBuilder[][] = {
				{"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"},	
				{"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"}
		};
		
		int[] nbJourParMoisAnneePair = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] nbJourParMois = nbJourParMoisAnneePair;
		
		System.out.println("Sommes nous en année bisextille ? (Oui/Non)");
		Scanner clavierStd1 = new Scanner(System.in);
		
		if(clavierStd1.nextLine().toLowerCase().equals("oui"))
			nbJourParMois[1] += 1;
		
		//Récupération du némero de jour au clavier
		System.out.println("Quel le numéro de jour ? ");
		Scanner clavierStd2 = new Scanner(System.in);
		int numDay = clavierStd2.nextInt();
		
		if(numDay > 366)
			System.out.println("Ce numéro n'est pas compris dans les numéros de jours du calendrier grégorien.");
		else
		{
			int mois = 0;
			for(int i = 0 ; i < nbJourParMois.length - 1; i++)
			{				
				numDay -= nbJourParMois[i];
	
				if(numDay <= 0)
					break;
				mois++;
			}
		
			System.out.println("Ce jour appartient au mois : " + dateBuilder[0][mois]);
		}
	}
}