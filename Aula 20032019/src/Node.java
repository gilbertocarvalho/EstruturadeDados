
public class Node {

		private char valor;
		
		private Node next;
		
		
		
		
		public Node(char element, Node topo) {
			// TODO Auto-generated constructor stub
			
		valor = element;
		
		next =topo;
			
		}
		
		public Node(char element) { 
			
			
			this(element, null);
			
		
		
		}





		public void setElement(char valor) {
			
			
			
			this.valor = valor;
			
			
		}
		
		
		
		
		
		public char getElement() {
			
			
			return valor;
			
			
			
		}





		public Node getNext() {
			return next;
		}





		public void setNext(Node next) {
			this.next = next;
		}
	
	
		
		
	
	
	
}
