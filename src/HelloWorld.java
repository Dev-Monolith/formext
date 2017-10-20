import java.util.Scanner;

public class HelloWorld
{
	private static String[] messages = {"Tu as ", " ans"};
	private static String dateBuilder[][] = {
		{"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"},	
		{"Vendredi", "Samedi", "Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi"}
	};
	
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
	
	public static void exManipulationTableau2Dimensions()
	{	
		int[] nbJourParMoisAnneePair = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] nbJourParMois = nbJourParMoisAnneePair;
		
		System.out.println("Sommes nous en année bisextille ? (Oui/Non)");
		Scanner clavierStd = new Scanner(System.in);
		
		if(clavierStd.nextLine().toLowerCase().equals("oui"))
			nbJourParMois[1] += 1;
		
		//Récupération du némero de jour au clavier
		System.out.println("Quel est le numéro du jour ? ");
		clavierStd = new Scanner(System.in);
		int numDay = clavierStd.nextInt();
		
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
	
	public static void main(String[] args)
	{
//		exManipulationTableau();
//		exManipulationTableau2Dimensions();
		
		System.out.println("Quel est le numéro du jour ? ");
		Scanner clavierStd = new Scanner(System.in);
		
		int nbDay = clavierStd.nextInt();
		final int m31 = 31;
		final int m30 = 30;
		int c31 = 1;
		int c30 = 1;
		int month = 0;
		
		int jour = nbDay % 7;
		
//		if(nbDay <= m31 * c31)
//			month = 0;//Janvier
//		else if(nbDay <= m31 * c31 + ((m30 * c30) - 1))
//			month = 1;//Fevrier
//		else if(nbDay <= m31 * ++c31 + ((m30 * c30) - 1))
//			month = 2;//Mars
//		else if(nbDay <= m31 * c31 + ((m30 * ++c30) - 1))
//			month = 3;//Avril
//		else if(nbDay <= m31 * ++c31 + ((m30 * c30) - 1))
//			month = 4;//Mai
//		else if(nbDay <= m31 * c31 + (m30 * ++c30) - 1)
//			month = 5;//Juin
//		else if(nbDay <= m31 * ++c31 + (m30 * c30) - 1)
//			month = 6;//Juillet
//		else if(nbDay <= m31 * ++c31 + (m30 * c30) - 1)
//			month = 7;//Aout
//		else if(nbDay <= m31 * c31 + (m30 * ++c30) - 1)
//			month = 8;//Septembre
//		else if(nbDay <= m31 * ++c31 + (m30 * c30) - 1)
//			month = 9;//Octobre
//		else if(nbDay <= m31 * c31 + (m30 * ++c30) - 1)
//			month = 10;//Novembre
//		else if(nbDay <= m31 * ++c31 + (m30 * c30) - 1)
//			month = 11;//Decembre
		
		c31 = 0;
		c30 = 0;
		int inverse = 1;
		
		for(int i = 0; i < 12; i++)
		{
			//A partir du mois d'Aout, on inverse l'ordre d'incrementation du nombre de mois par rapport aux indices impair
			if(i == 7)
				inverse = 0;
			
			//On incrémente le nombre de mois de 31 ou 30 jour en fonction de l'incide pair/impair
			if(i%2 == inverse)
				c31++;
			else
				c30++;
			
			if(nbDay <= m31 * c31 + (m30 * c30) - 1)
			{
				month = i;
				break;
			}
		}
		
		
		System.out.println(dateBuilder[1][jour - 1] + " " + dateBuilder[0][month]);
	}
}