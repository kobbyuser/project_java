package lol;

import java.util.Objects;

public class Fortnite extends JeuxVideo {
	private String Mode;

	public Fortnite(String nom, String type, int nbr_player, int storage, String mode) {
		super(nom, type, nbr_player, storage);
		Mode = mode;
	}

	@Override
	public String toString() {
		return "Fortnite [Mode=" + Mode + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fortnite other = (Fortnite) obj;
		return Objects.equals(Mode, other.Mode);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

    
}
