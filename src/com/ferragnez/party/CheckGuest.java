package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		/*Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party, a cui aggiungere la classe CheckGuest
			Nel programma bisogna:
			creare e inizializzare l’array contenente i nomi degli invitati
			chiedere all’utente come si chiama verificare che il nome sia presente nell’array
			lasciarlo entrare o rispedirlo cortesemente da dove è venuto
			
			 Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone,
			 Rachel Zeilic*/ 
		
		//creo array di stringa e lo nizializzo
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax" , "Francesco Totti", "Ilary Blasi","Bebe Vivo","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
		//variabili
		
		String persona;
		Scanner sc = new Scanner(System.in);
		boolean trovato = false;
		int counter=0;
		
		System.out.println("Benvenuto al Ferragnez party! Nome prego: ");
		persona = sc.nextLine();
		
		//continuo fino a che non l ho trovato e fino a che sono nella lunghezza dell array
				while(!trovato && counter < invitati.length) {
					if(invitati[counter].equalsIgnoreCase(persona)) {
						trovato = true;  //se lo trovo
						System.out.println("Il tuo nome è sulla lista, puoi entrare");
					}else { //se non lo trovo aumento il contatore
						counter++;
					}
				}
				//se non l hai trovato
				if(!trovato) {
					System.out.println("Il tuo nome non è sulla lista, non puoi entrare!");
				}
				
		
			
			
		
		sc.close();
	}

}
