package lol;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Uncharted {
	private List<JeuxVideo> saisonprime= new ArrayList<JeuxVideo>();
	
	public void alimenter() {
		saisonprime.add(new JeuxVideo("Drake's Fortune","Aventure",1,45));
		saisonprime.add(new JeuxVideo("Among Thieves","Aventure",1,45));
		saisonprime.add(new JeuxVideo("Drake's Deception","Aventure",1,45));
	}
	
	public void afficheList() {
		for(JeuxVideo jeux: saisonprime) 
			System.out.println(jeux);
	}

	public void parcourir() {
		Iterator<JeuxVideo>it =saisonprime.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void insererElement(JeuxVideo jeux) {
		saisonprime.add(jeux); 
	}
	
	public JeuxVideo recupererJeux(int i) {
		if(i>=0 && i<saisonprime.size())
			 return saisonprime.get(i);
		throw new IllegalArgumentException("la position doit étre comprise entre 0 et la taille");
	}
	
	public void supprimerJeux(JeuxVideo jeux) {
		saisonprime.remove(jeux);
	}
	
	public boolean chercheJeux(JeuxVideo jeux) {
		return saisonprime.contains(jeux);
	}
	
//	public void trierListJeux(Comparator<JeuxVideo> comparator) {
//		Collections.sort(saisonprime, comparator);
//	}
	
	public void trierListJeux() {
		Collections.sort(saisonprime);
	}
	
	public void copierList() {
		List<JeuxVideo> chapitre = new ArrayList<JeuxVideo>();
		chapitre.addAll(saisonprime);
		JeuxVideo[] chap = chapitre.toArray(new JeuxVideo[chapitre.size()]);
	}
	
	public void mellangeJeux() {
		Collections.shuffle(saisonprime);
	}
	
	public void inverseOrdre() {
		Collections.reverse(saisonprime);
	}
	
	public ArrayList<JeuxVideo> subListJeux(int i,int j){
		return new ArrayList<JeuxVideo>(saisonprime.subList(i, j));
	}
	
	public boolean compareJeux(JeuxVideo jeux) {
		return saisonprime.equals(jeux);
	}
	
	public void echangerJeux(int e1, int e2) {
		Collections.swap(saisonprime, e1, e2);
	}
	
	public void soldOut() {
		saisonprime.clear();
	}
	
	public boolean emptyListe() {
		return saisonprime.isEmpty();
	}
	
}
