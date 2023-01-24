package exo_vehicule;

public class Pompe {
	private String typeCarburant;
	private int contenance;
	private int contenu;
	
	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public int getContenance() {
		return contenance;
	}

	public void setContenance(int contenance) {
		this.contenance = contenance;
	}

	public int getContenu() {
		return contenu;
	}

	public void setContenu(int contenu) {
		this.contenu = contenu;
	}

	public Pompe(String typeCarburantIn, int contenanceIn, int contenuIn) {
		this.typeCarburant = typeCarburantIn;
		this.contenance = contenanceIn;
		this.contenu = contenuIn;
	}

	@Override
	public String toString() {
		if (contenu == 0) {
			return "La pompe " + typeCarburant + " est vide !";
		} else {
			return "La pompe " + typeCarburant + " contient " + contenu + "/" + contenance + " L";			
		}
	}
	
}
