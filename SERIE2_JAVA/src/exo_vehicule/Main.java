package exo_vehicule;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("----- VOITURE 1 AVANT RESERVOIR -----");
		Voiture car1 = new Voiture("Diesel", 130);
		System.out.println(car1);
		System.out.println("\n----- MOTO 1 AVANT RESERVOIR -----");
		Moto moto1 = new Moto("Essence", 170);
		System.out.println(moto1);
		
		car1.contenanceReservoir = 55;
		car1.contenuReservoir = 40;
		
		moto1.contenanceReservoir = 15;
		moto1.contenuReservoir = 7;
		
		System.out.println("\n----- VOITURE 1 APRES RESERVOIR -----");
		System.out.println(car1);
		System.out.println("\n----- MOTO 1 APRES RESERVOIR -----");
		System.out.println(moto1);
		
		Pompe pompeD = new Pompe("Diesel", 15, 14);
		Pompe pompeE = new Pompe("Essence", 500, 478);
		
		System.out.println("\n----- POMPE DIESEL AVANT PLEIN -----");
		System.out.println(pompeD);
		System.out.println("\n----- POMPE ESSENCE AVANT PLEIN -----");
		System.out.println(pompeE);
		
		ArrayList<Pompe> listePompes = new ArrayList<Pompe>();
		listePompes.add(pompeD);
		listePompes.add(pompeE);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nQuel carburant ? Essence ou Diesel ?");
		String selected = sc.next();
		Pompe selectedPompe = null;
		for (Pompe pompe : listePompes) {
			if (pompe.getTypeCarburant().equalsIgnoreCase(selected)) {
				selectedPompe = pompe;
			}
		}
		System.out.println("\n----- VOITURE 1 APRES PLEIN -----");
		car1.fairePlein(selectedPompe);
		System.out.println(car1);
		
		System.out.println("\nQuel carburant ? Essence ou Diesel ?");
		selected = sc.next();
		for (Pompe pompe : listePompes) {
			if (pompe.getTypeCarburant().equalsIgnoreCase(selected)) {
				selectedPompe = pompe;
			}
		}
		System.out.println("\n----- MOTO 1 APRES PLEIN -----");
		moto1.fairePlein(selectedPompe);
		System.out.println(moto1);
		System.out.println("\n----- POMPE DIESEL APRES PLEIN -----");
		System.out.println(pompeD);
		System.out.println("\n----- POMPE ESSENCE APRES PLEIN -----");
		System.out.println(pompeE);
		
		sc.close();
	}

}
