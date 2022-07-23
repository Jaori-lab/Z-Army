package org.army;

import org.army.comportement.*;

public class Medecin extends Personnage {

	public Medecin() {
		this.soi = new PremierSoin();
	}
	
	public Medecin(EspritCombatif esprit, Soin soin, Deplacement deplacement) {
		super(esprit, soin, deplacement);
	}
	

}




/*public void seDeplacer() {
System.out.println("Du moment que j'ai ma trousse de secours , j'avance ..");
}


public void combattre() {
System.out.println("Je ne me bat que si ma vie est mise en danger, je n'ai pas d'armes , hormis mon scalpel ");
}
public void soigner() {
System.out.println("Je soigne les bléssés !!");
}*/