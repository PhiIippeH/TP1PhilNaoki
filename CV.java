package assquallogtp1;

public class CV {

	String nom="",prenom="",formation="",competences="",attentes="";
	int nbannee=0;
	CV[] personnes=new CV[2];
	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue chez Barette!");
		personnes[0]=new CV("Miyazaki-Chapleau","Naoki","Euh ca veut dire quoi ca","");
	}
	public CV(String n, String p, String f, String c, String a, int ann) {
		nom=n;
		prenom=p;
		formation=f;
		competences=c;
		attentes=a;
		nbannee=ann;
	}

}