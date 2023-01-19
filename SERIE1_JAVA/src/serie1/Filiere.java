package serie1;

public class Filiere {
	/* VARIABLES */
	private String code;
	private String libelle;
	
	/* GETTERS AND SETTERS */
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/* CONSTRUCTEUR */
	public Filiere(String newCode, String newLib) {
		this.code = newCode;
		this.libelle = newLib;
	}
}
