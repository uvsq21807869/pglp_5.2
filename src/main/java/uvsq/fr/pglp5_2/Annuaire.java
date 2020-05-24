package uvsq.fr.pglp5_2;

import java.util.Iterator;
import java.io.Serializable;

public class Annuaire implements Iterable<Team>, Serializable{

	private static Annuaire ANNUAIRE;
	
	private TeamIterator<Team> head;

	
	private Annuaire() {
		head = new TeamIterator<Team>();
		
	}

	public static Annuaire getInstance() {

		if (ANNUAIRE == null)
			ANNUAIRE = new Annuaire();

		return ANNUAIRE;
	}
	
	public void addEquipe(Team t) {

		this.head.add(t);
		
	}

	@Override
	public Iterator<Team> iterator() {
		// TODO Auto-generated method stub
		return this.head;
	}

}
