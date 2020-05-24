package uvsq.fr.pglp5_2;

import java.io.Serializable;
import java.util.Iterator;

public class TeamIterator<Team> implements Iterator<Team> , Serializable{

		private int index;
		private Node<Team> t;
		@Override
		public boolean hasNext() {
			if(t != null) {
				return true;
				
			}
			return false;
		}

		@Override
		public Team next() {
			Team tmp = t.getElement();
			t = t.getNext();
			index ++;
			return tmp;
		}


		public void add(Team n) {
			
			
			if(t == null) {
				this.t = new Node<Team>(n);
			}
			else {
				
				this.t.addElement(n);

			}
		

		}
}
