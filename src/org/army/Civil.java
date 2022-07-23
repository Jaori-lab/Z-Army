package org.army;

import org.army.comportement.*;

public class Civil extends Personnage {

	public Civil() {
		
	}
	public Civil(EspritCombatif esprit, Soin soin, Deplacement deplacement) {
		super(esprit, soin, deplacement);
	} 
	
}

/*public void seDeplacer() {
System.out.println("Je me cache , en attendant l'arrivée des alliés");
}


public void combattre() {
System.out.println("Je protège les miens !!");
}*/
