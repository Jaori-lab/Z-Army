
public class Main {

	public static void main(String[] args) {

		/** Personnage s1 = new Sniper();
		s1.combattre();
		
		Chirurgien s2 = new Chirurgien();
		s2.combattre();
		s2.soigner(); */
		
		Personnage[] pers = {
				new Guerrier(),
				new Chirurgien(),
				new Civil(),
				new Sniper(),
				new Medecin()
		};
		for(Personnage p : pers) { // Parcours chaque �l�mentc(p) d'un tableau (pers)
			System.out.println("\nInstance de "+p.getClass().getName());
			System.out.println("******************************************************************");
			p.combattre();
			p.seDeplacer();
			// p.soigner(); Probl�me de compilation non r�solu : La m�thode soigner() est ind�finie pour le type Personnage
		}
	}

}
