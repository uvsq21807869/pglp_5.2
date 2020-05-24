package uvsq.fr.pglp5_2;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Groupe  extends Team implements Iterable<Team>, Serializable {

			private final String nom;
			private List<Team> list;
			
			
			public Groupe(String nom) {
				list = new ArrayList<Team>(); 
				this.nom = nom;	
			}
			
			
		
			
			public String getNom() {
				return this.nom;
			}


			public void ajoutMembre(Personnel p) {

				list.add(p);

			}

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}




			@Override
			public Iterator<Team> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
		

		


}
