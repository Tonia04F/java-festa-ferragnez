package com.ferragnez.party;

import java.util.Scanner;

public class Bonus {
	public static void main (String[] args) {
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax" , "Francesco Totti", "Ilary Blasi","Bebe Vivo","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
		
		
		String persona;
		Scanner sc = new Scanner(System.in);
		boolean trovatoo = false;
		
		System.out.println("Benvenuto al Ferragnez party, nome prego: ");
		persona = sc.nextLine();
		
		for(int i =0; i < invitati.length; i ++) {
			
		
				if(invitati[i].equalsIgnoreCase(persona)) {
					trovatoo = true;
					System.out.println("puoi entrare");
				}
			}
			if(!trovatoo) {
				System.out.println("hai perso!");
			}
			
			sc.close();
		}
		
	}


