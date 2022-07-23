package org.army;

import org.army.comportement.*;

public abstract class Personnage {
	
	// Instances de comportement par default
	
	protected EspritCombatif esp = new Pacifiste();
	protected Soin soi = new AucunSoin();
	protected Deplacement depl = new Marcher();
	
	// Constructeur par default
	
	public Personnage() {
		
	}
	
	// Constructeur avec params
	
	public Personnage(EspritCombatif esprit, Soin soin, Deplacement deplacement){
		this.esp = esprit;
		this.soi = soin;
		this.depl = deplacement;
	}
	
	// Methode de déplacement d'un personnage
	
	public void seDeplacer() {
		depl.deplacer();
	}
	
	// Méthode de combat
	
	public void combattre() {
		esp.combat();
	}
	
	// Méthode de soin
	
	public void soigner() {
		soi.soigne();
	}

	/**
	 * @param esp le esp à définir
	 */
	public void setEsp(EspritCombatif esp) {
		this.esp = esp;
	}

	/**
	 * @param soi le soi à définir
	 */
	public void setSoi(Soin soi) {
		this.soi = soi;
	}

	/**
	 * @param depl le depl à définir
	 */
	public void setDepl(Deplacement depl) {
		this.depl = depl;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*************************************************************************************************
	/*protected String armes = "", chaussures ="", sacDeSoin = "";
	
	public abstract void seDeplacer();
	
	public abstract void combattre();
	
	public abstract void soigner();

	
	protected String getArmes() {
		return armes;
	}


	protected String getChaussures() {
		return chaussures;
	}

	
	protected String getSacDeSoin() {
		return sacDeSoin;
	}

	
	protected void setArmes(String armes) {
		this.armes = armes;
	}

	
	protected void setChaussures(String chaussures) {
		this.chaussures = chaussures;
	}


	protected void setSacDeSoin(String sacDeSoin) {
		this.sacDeSoin = sacDeSoin;
	}*/
	
	

