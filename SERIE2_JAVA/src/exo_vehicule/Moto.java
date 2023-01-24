package exo_vehicule;

public class Moto extends Vehicule {
	
	public Moto(String carburantIn, int vMaxIn) {
		super(2, carburantIn, vMaxIn);
	}
	
	public String toString() {
		return "Nombre de roues : " + nbRoues + "\nCarburant : " + carburant + "\nVitesse Max : " + vMax + " km/h\nReservoir : "
				+ contenuReservoir + "/" + contenanceReservoir + " L";
	}
}
