package lol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ResidentEvil {
	private JeuxVideo[] season = new JeuxVideo[9];

	public ResidentEvil(JeuxVideo[] season) {
		for(int i=0; i<season.length;i++) {
		this.season = season;
		}
		}
		
public void trier() {
	Arrays.sort(season);
	}

	
public void inserer(JeuxVideo jeux) {
ArrayList <JeuxVideo> S= new ArrayList<JeuxVideo>();
S=new ArrayList<JeuxVideo>(Arrays.asList(season));
S.add(jeux);
JeuxVideo[] season = S.toArray(new JeuxVideo[S.size()]);


	
}
public void supprimer(int index) {
	ArrayList <JeuxVideo> S= new ArrayList<JeuxVideo>();
	S=new ArrayList<JeuxVideo>(Arrays.asList(season));
	S.remove(index);
	JeuxVideo[] season = S.toArray(new JeuxVideo[S.size()]);
	
}
	
public int element() {
	return (season.length);
}

public void inverser() {
	ArrayList <JeuxVideo> seasonverse= new ArrayList<JeuxVideo>();
	seasonverse=new ArrayList<JeuxVideo>(Arrays.asList(season));
	Collections.reverse(seasonverse);
	JeuxVideo[] season = seasonverse.toArray(new JeuxVideo[seasonverse.size()]);
}

public void affiche() {
	System.out.println(Arrays.toString(season));
}

public int grandelement(JeuxVideo[] season) {
	int gelement = 0;
    for (int i = 1; i < season.length; i++) {
        if (season[i].compareTo(season[gelement])>0) {
            gelement = i;
        }
    }
    return gelement;
}

public void equal(JeuxVideo[] ark) {
	if (Arrays.equals(season, ark))
		System.out.println("les deux Arrays sont egaux");
	else
		System.out.println("les deux Arrays ne sont pas egaux");
}

	

}
