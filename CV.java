
public class CV {

	String nom = "", prenom = "",formation="",competences="",attentes="";
	int nbanne=0;
	
	CV[] personnes = new CV[2];
	public static void main( String[] args ) {
		// TODO Auto-generated method stub

	}
	
	public CV(String nom, String prenom, String formation, String competences,String Attentes,int nbanne) {
	this.nom = nom;
	this.prenom = prenom;
	this.formation = formation;
	this.competences = competences;
	this.attentes = Attentes;
	this.nbanne = nbanne;
	}

}
