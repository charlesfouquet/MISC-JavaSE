package serie1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
/* EXERCICE 1 */
		ArrayList<Specialite> listeSpe = new ArrayList<>();
		
		Specialite java_jee = new Specialite("JAVA/JEE");
		listeSpe.add(java_jee);
		
		Specialite html_css = new Specialite("HTML/CSS");
		listeSpe.add(html_css);
		
		Specialite pm = new Specialite("Gestion de projet");
		listeSpe.add(pm);
		
		Specialite js = new Specialite("JS");
		listeSpe.add(js);
		
		Specialite php = new Specialite("PHP");
		listeSpe.add(php);
		
		ArrayList<Enseignant> listeEns = new ArrayList<>();
		listeEns.add(new Enseignant("Camara", "Moussa", java_jee));
		listeEns.add(new Enseignant("Hawking", "Stephen", java_jee));
		listeEns.add(new Enseignant("Einstein", "Albert", php));
		listeEns.add(new Enseignant("Cooper", "Sheldon", js));
		
		System.out.println("         EXERCICE 1         ");
		for (Specialite elt1 : listeSpe) {
			int ensCounter = 0;
			System.out.println("----------------------------");
			System.out.println(elt1.getNom_spe() + " :");
			for (Enseignant elt2 : listeEns) {
				if (elt2.getSpecialite().getNom_spe() == elt1.getNom_spe()) {
					System.out.println("\t" + elt2.getPrenom() + " " + elt2.getNom());					
					ensCounter++;
				}
			}
			if (ensCounter == 0) {
				System.err.println("\tAucun enseignant pour la spécialité " + elt1.getNom_spe());									
			}
		}
		System.out.println("----------------------------\n\n");
		
/* EXERCICE 2 */
		ArrayList<Filiere> listeFil = new ArrayList<>();
		
		Filiere cda = new Filiere("CDA", "Concepteur Développeur d'Applications");
		listeFil.add(cda);
		
		Filiere mk = new Filiere("MK", "Marketing");
		listeFil.add(mk);
		
		Filiere av = new Filiere("AV", "Assistance de Vie");
		listeFil.add(av);
		
		ArrayList<Apprenant> listeAppr = new ArrayList<>();
		listeAppr.add(new Apprenant("Simpson", "Homer", cda));
		listeAppr.add(new Apprenant("Sultan", "Vanessa", mk));
		listeAppr.add(new Apprenant("Simpson", "Marge", mk));
		listeAppr.add(new Apprenant("Simpson", "Bart", cda));
		listeAppr.add(new Apprenant("Simpson", "Lisa", mk));
		
		System.out.println("         EXERCICE 2         ");
		for (Filiere elt1 : listeFil) {
			int apprCounter = 0;
			System.out.println("----------------------------");
			System.out.println(elt1.getLibelle() + " (" + elt1.getCode() + ") :");
			for (Apprenant elt2 : listeAppr) {
				if (elt2.getFiliere().getCode() == elt1.getCode()) {
					System.out.println("\t" + elt2.getPrenom() + " " + elt2.getNom());					
					apprCounter++;
				}
			}
			if (apprCounter == 0) {
				System.err.println("\tPas d'inscrit");									
			}
		}
		System.out.println("----------------------------\n\n");
		
/* EXERCICE 3 */
		listeEns.add(new Enseignant("Burns", "Charles Montgomery", java_jee, cda));
		listeEns.add(new Enseignant("Kas", "Zack", java_jee, mk));
		
		System.out.println("         EXERCICE 3         ");
		for (Filiere elt1 : listeFil) {
			int apprCounter = 0;
			System.out.println("----------------------------");
			System.out.println(elt1.getLibelle() + " (" + elt1.getCode() + ")");
			for (Enseignant elt2 : listeEns) {
				if ((elt2.getFiliere() != null) && (elt2.getFiliere().getCode() == elt1.getCode())) {
					System.out.println("Formateur : " + elt2.getPrenom() + " " + elt2.getNom() + "\n");	
				}
			}
			for (Apprenant elt3 : listeAppr) {
				if (elt3.getFiliere().getCode() == elt1.getCode()) {
					System.out.println("\t" + elt3.getPrenom() + " " + elt3.getNom());					
					apprCounter++;
				}
			}
			if (apprCounter == 0) {
				System.err.println("\tPas d'inscrit");									
			}
		}
		System.out.println("----------------------------\n\n");
		
/* EXERCICE 4 */
		System.out.println("Souhaitez vous rechercher un formateur (1) ou une filiere (2) ?");
		Scanner sc = new Scanner(System.in);
		int filter = sc.nextInt();
		
		if (filter == 1) {
			System.out.println("\nQuel est le nom ou prenom du formateur ?");
			String selectedFormateur = sc.next();
			String successFormateur = null;
			Filiere successFiliere = null;
			
			for (Enseignant elt1 : listeEns) {
				if ((elt1.getNom().contains(selectedFormateur)) || (elt1.getPrenom().contains(selectedFormateur))) {
					successFormateur = elt1.getPrenom() + " " + elt1.getNom();
					successFiliere = elt1.getFiliere();
					int apprCounter = 0;
					for (Apprenant elt2 : listeAppr) {
						if (elt2.getFiliere() == successFiliere) {
							apprCounter++;
						}
					}
					System.out.println("\n" + successFormateur + " anime la formation \"" + successFiliere.getLibelle() + "\" avec " + apprCounter + " apprenants :");
					for (Apprenant elt2 : listeAppr) {
						if (elt2.getFiliere() == successFiliere) {
							System.out.println("\t" + elt2.getPrenom() + " " + elt2.getNom());
						}
					}
				}
			}
			if (successFormateur == null){
				System.out.println("Formateur non trouvé");
			}
		} else if (filter == 2) {
			System.out.println("\nQuel est le libellé ou code de la formation ?");
			String selectedFiliere = sc.next();
			String successFormateur = null;
			Filiere successFiliere = null;
			
			for (Enseignant elt1 : listeEns) {
				if ((elt1.getFiliere() != null) && ((elt1.getFiliere().getCode().contains(selectedFiliere)) || (elt1.getFiliere().getLibelle().contains(selectedFiliere)))) {
					successFormateur = elt1.getPrenom() + " " + elt1.getNom();
					successFiliere = elt1.getFiliere();
					int apprCounter = 0;
					for (Apprenant elt2 : listeAppr) {
						if (elt2.getFiliere() == successFiliere) {
							apprCounter++;
						}
					}
					System.out.println("\nLa formation \"" + successFiliere.getLibelle() + "\" est animée par " + successFormateur + " avec " + apprCounter + " apprenants :");
					for (Apprenant elt2 : listeAppr) {
						if (elt2.getFiliere() == successFiliere) {
							System.out.println("\t" + elt2.getPrenom() + " " + elt2.getNom());
						}
					}
				}
			}
			if (successFiliere == null){
				System.out.println("Formation non trouvée et/ou non enseignée");
			}
		}
		sc.close();
	}
}
