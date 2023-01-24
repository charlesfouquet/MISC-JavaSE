package exo_vehicule;

public class Vehicule {
	protected int nbRoues;
	protected String carburant;
	protected int vMax;
	protected int contenanceReservoir;
	protected int contenuReservoir;
	
	public Vehicule(int nbRouesIn) {
		this.nbRoues = nbRouesIn;
	}
	
	public Vehicule(int nbRouesIn, String carburantIn, int vMaxIn) {
		this.nbRoues = nbRouesIn;
		this.carburant = carburantIn;
		this.vMax = vMaxIn;
	}
	
	public void fairePlein(Pompe pompeIn) {
		if (this.carburant.equals(pompeIn.getTypeCarburant())) {
			int volumePlein = this.contenanceReservoir - this.contenuReservoir;
			if (pompeIn.getContenu() >= volumePlein) {
				this.contenuReservoir = this.contenanceReservoir;
				pompeIn.setContenu(pompeIn.getContenu() - volumePlein);				
			} else {
				this.contenuReservoir += pompeIn.getContenu();
				pompeIn.setContenu(0);				
			}
		} else {
			System.err.println("Attention ! Mauvais carburant selectionne !");
		}
	}
}
