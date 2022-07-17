
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
		for(Personnage p : pers) { // Parcours chaque élémentc(p) d'un tableau (pers)
			System.out.println("\nInstance de "+p.getClass().getName());
			System.out.println("******************************************************************");
			p.combattre();
			p.seDeplacer();
			// p.soigner(); Problème de compilation non résolu : La méthode soigner() est indéfinie pour le type Personnage
		}
	}

}
