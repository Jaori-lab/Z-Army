package org.army;

import org.army.comportement.Operation;
import org.army.comportement.PremierSoin;

public class Main {

	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		/** Personnage s1 = new Sniper();
		s1.combattre();
		
		Chirurgien s2 = new Chirurgien();
		s2.combattre();
		s2.soigner(); */
		
		/*Personnage [] pers = {
				new Guerrier(),
				//new Chirurgien(),
				new Civil(),
				//new Sniper(),
				new Medecin()
		};
		
		// String [] armes = {"fusil de sniper","","","fusil de sniper","couteau","fusil � pompe"};
		
		for(int i=0 ; i<pers.length ; i++) {
			System.out.println("\nInstance de " + pers[i].getClass().getName());
			System.out.println("***************************************************************");
			pers[i].combattre();
			pers[i].seDeplacer();
			pers[i].soigner();
		}*/
		Personnage pers = new Guerrier();
		pers.soigner();
		pers.setSoi(new Operation());
		pers.soigner();
		pers.setSoi(new PremierSoin());
		pers.soigner();
}
	}
















/*for(Personnage p : pers) { // Parcours chaque �l�mentc(p) d'un tableau (pers)
System.out.println("\nInstance de "+p.getClass().getName());
System.out.println("******************************************************************");
p.combattre();
p.seDeplacer();
// p.soigner(); Probl�me de compilation non r�solu : La m�thode soigner() est ind�finie pour le type Personnage
}

for (int i=0 ; i < pers.length ; i++) { 
System.out.println("\nInstance de "+pers[i].getClass().getName());
System.out.println("******************************************************************");
pers[i].setArmes(armes[i]);
pers[i].combattre();
pers[i].seDeplacer();
}*/
