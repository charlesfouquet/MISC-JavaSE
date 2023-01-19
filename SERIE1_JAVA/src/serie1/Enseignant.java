package serie1;

public class Enseignant {
	/* VARIABLES */
	private String nom;
	private String prenom;
	private Specialite specialite;
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
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	/* CONSTRUCTEURS */
	public Enseignant(String newNom, String newPrenom, Specialite newSpe) {
		this.nom = newNom;
		this.prenom = newPrenom;
		this.specialite = newSpe;
	}
	
	public Enseignant(String newNom, String newPrenom, Specialite newSpe, Filiere newFiliere) {
		this.nom = newNom;
		this.prenom = newPrenom;
		this.specialite = newSpe;
		this.filiere = newFiliere;
	}
}
