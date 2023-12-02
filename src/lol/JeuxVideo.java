package lol;

import java.util.Objects;

public class JeuxVideo implements Comparable <JeuxVideo>{
	private String nom;
	private String type;
	private int nbr_player;
	private int storage ;
	
	public JeuxVideo(String nom, String type, int nbr_player, int storage) {
		this.nom = nom;
		this.type = type;
		this.nbr_player = nbr_player;
		this.storage = storage;
	}
	

	@Override
	public String toString() {
		return "JeuxVideo [nom=" + nom + ", type=" + type + ", nbr_player=" + nbr_player + ", storage=" + storage + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JeuxVideo other = (JeuxVideo) obj;
		return nbr_player == other.nbr_player && Objects.equals(nom, other.nom) && storage == other.storage
				&& Objects.equals(type, other.type);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	@Override
	public int compareTo(JeuxVideo o) {
	
		return 0;
	}
	

}
