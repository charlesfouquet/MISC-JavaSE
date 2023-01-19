package serie1;

public class Apprenant {
	/* VARIABLES */
	private String nom;
	private String prenom;
	private Filiere filiere;
	
	/* GETTERS AND SETTERS */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	/* CONSTRUCTEUR */
	public Apprenant(String newNom, String newPrenom, Filiere newFiliere) {
		this.nom = newNom;
		this.prenom = newPrenom;
		this.filiere = newFiliere;
	}
}
