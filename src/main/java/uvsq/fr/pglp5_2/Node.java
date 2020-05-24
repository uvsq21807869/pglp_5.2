package uvsq.fr.pglp5_2;

import java.io.Serializable;

public class Node<T>implements Serializable  {


		private Node<T> precedent = null; // noeud précedent
		private Node<T> suivant = null; //noeud suivant
		private T element;              //élément du noeud courant
		
		
		
		public Node(T element){
			
			this.element = element;
			
		}
		
		public void addElement(T suivant) {
			
			if (this.suivant == null) {
				this.suivant = new Node<T>(suivant);
				this.suivant.precedent = this;
			}
			else 
				this.suivant.addElement(suivant);
			
			
		}
		
	
		public T getElement() {
			
			return this.element;
		}
	
		public void remove() {
			
			this.precedent.suivant = this.suivant;
			this.suivant.precedent = this.precedent;
			this.element = null;
			this.suivant = null;
			this.precedent = null;
		}
	
		public boolean hasNext() {
			
			if (this.suivant != null) return true;
			else return false;
		}
		
		
		public Node<T> getNext() {
			
			return this.suivant;
		}
		
		public Node<T> getPrevious() {
			
			return this.precedent;
		}

}
