package exo_vehicule;

public class Voiture extends Vehicule {
	
	public Voiture(String carburantIn, int vMaxIn) {
		super(4, carburantIn, vMaxIn);
	}

	public String toString() {
		return "Nombre de roues : " + nbRoues + "\nCarburant : " + carburant + "\nVitesse Max : " + vMax + " km/h\nReservoir : "
				+ contenuReservoir + "/" + contenanceReservoir + " L";
	}
}
