package serie1;

public class Specialite {
	/* VARIABLE */
	private String nom_spe;
	
	/* GETTERS AND SETTERS */
	public String getNom_spe() {
		return nom_spe;
	}
	public void setNom_spe(String nom_spe) {
		this.nom_spe = nom_spe;
	}
	
	/* CONSTRUCTEUR */
	public Specialite(String newNom) {
		this.nom_spe = newNom;
	}
}
