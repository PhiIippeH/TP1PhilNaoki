
public class CV {

	String nom = "", prenom = "", formation = "", competences = "", attentes = "";
	int nbanne = 0;

	public static void main( String[] args ) {
		// TODO Auto-generated method stub
		System.out.println( "Bienvenue chez Barette!" );
		CV Naoki = new CV( "Miyazaki-Chapleau", "Naoki", "DEC Montmorency", "Ordinateurs",
				"Comprendre et analyser en profondeur git", 2 );
		affiche( Naoki );
		CV Philippe = new CV( "H�tu", "Philippe", "DEC Montmorency", "Ordinateurs",
				"Comprendre et analyser en profondeur git", 2 );
		affiche( Philippe );

	}

	public CV( String nom, String prenom, String formation, String competences, String attentes, int nbanne ) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.competences = competences;
		this.attentes = attentes;
		this.nbanne = nbanne;
	}
	public static void affiche( CV personne ) {
		System.out.println( "\nPersonne : \n" + "\nNom : " + personne.nom + "\nPrenom : " + personne.prenom + "\nFormation : "
				+ personne.formation + "\nComp�tences : " + personne.competences + "\nAttentes : " + personne.attentes
				+ "\nNombre d'ann�es : " + personne.nbanne + " ans." );
	}
	
}
