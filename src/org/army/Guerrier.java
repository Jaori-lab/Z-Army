package org.army;

import org.army.comportement.*;

public class Guerrier extends Personnage{

	public Guerrier() {
		this.esp = new CombatPistolet();
	}
	
	public Guerrier(EspritCombatif esprit, Soin soin, Deplacement deplacement) {
		super(esprit, soin, deplacement);
	}

}


/*public void seDeplacer() {
System.out.println("Je me déplace comme je peux ..");
}


public void combattre() {
if (this.armes.equals("pistolet"))
System.out.println("J'utilise un pistolet");
else if (this.armes.equals("fusil de sniper"))
System.out.println("J'utilise un fusil de sniper");
else
System.out.println("Je me débrouille comme je peux !!");
}*/