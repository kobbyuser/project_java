package lol;

import java.util.ArrayList;

public class VideoGame {

	public static void main(String[] args) {
		System.out.println("Rezident Evil");
		JeuxVideo[] jeux = {
                new JeuxVideo("Resident Evil Remastred", "horror", 1, 40),
                new JeuxVideo("Resident Evil 2", "horror", 1, 30),
                new JeuxVideo("Resident Evil Nimses", "horror", 1, 70),
                new JeuxVideo("Resident Evil 4", "horror", 1, 40),
                new JeuxVideo("Resident Evil 5", "horror", 1, 20),
                new JeuxVideo("Resident Evil Biohazard ", "horror", 1, 40),
                new JeuxVideo("Resident Evil Biohasard 7", "horror", 1, 50),
                new JeuxVideo("Resident Evil Village", "horror", 1, 30),
                new JeuxVideo("Resident Evil 9", "horror", 1, 60)
		};
		
		ResidentEvil re = new ResidentEvil(jeux);
		re.affiche();
		
		re.trier();
		System.out.println("Rezident Evil");
		re.affiche();
		
		JeuxVideo newre = new JeuxVideo("Resident Evil Separat away", "horror", 1, 10);
		re.inserer(newre);
		System.out.println("Rezident Evil avec le nouveau DLC");
		re.affiche();
		
		re.supprimer(4);
		System.out.println("Rezident Evil sans le 4");
		re.affiche();
		
		System.out.println("Nombre des jeux dans le tableau : " + re.element());

		re.inverser();
		System.out.println("Rezident Evil reverce order");
		re.affiche();
		
		re.grandelement(jeux);
		System.out.println("Rezident Evil Le jeux Le plus grand");
		re.affiche();
		
		re.equal(jeux);
		
		System.out.println("Uncharted");
		
		Uncharted Unch = new Uncharted();
		
		Unch.alimenter();
		Unch.afficheList();
		Unch.parcourir();
		
		JeuxVideo nvUnch = new JeuxVideo("Uncharted 5 (not existe)", "Aventure", 1, 100);
		Unch.insererElement(nvUnch);
		System.out.println("la nouvelle liste");
		Unch.afficheList();
		
		Unch.recupererJeux(3);
		
		Unch.supprimerJeux(nvUnch);
		System.out.println("la nouvelle liste apres supression");
		Unch.afficheList();
		
		Unch.chercheJeux(nvUnch);
		
		Unch.trierListJeux();
		System.out.println("la nouvelle liste Trier");
		Unch.afficheList();
		
		Unch.copierList();
		
		Unch.mellangeJeux();
		System.out.println("la nouvelle liste mellanger");
		Unch.afficheList();
		
		Unch.inverseOrdre();
		System.out.println("la nouvelle liste avec l'ordre inverse");
		Unch.afficheList();
		
		 ArrayList<JeuxVideo> subList = Unch.subListJeux(1,3);
	        System.out.println("Sous liste des jeux : " + subList);
		
		JeuxVideo nouveau = new JeuxVideo("Uncharted 3.3", "Aventure", 1, 50);
        System.out.println("Comparer la liste avec un jeu : " + Unch.compareJeux(nouveau));

		
		Unch.echangerJeux(1,2);
		System.out.println("la nouvelle liste avec swap");
		Unch.afficheList();
		
		Unch.soldOut();
		System.out.println("la nouvelle liste aprés supression");
		Unch.afficheList();
		
		Unch.emptyListe();
		System.out.println("la nouvelle liste vide");
		Unch.afficheList();
	}

}
