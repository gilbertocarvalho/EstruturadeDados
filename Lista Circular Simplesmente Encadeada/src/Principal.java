
public class Principal {

	public static void main(String args[]) {
		
		
		ListaCircular lista = new ListaCircular();
		
		
		//lista.show();
		
		lista.insertFist(new Node("abacaxi"));
		
		lista.insertFist(new Node("uva"));
		
		lista.insertFist(new Node("limão"));
		
		lista.insertFist(new Node("laranja"));
		
		lista.insertFist(new Node("banana"));
		
		//System.out.println(lista.getLast().getValor());
		
		lista.removeLast();
		
		lista.removeLast();
		lista.removeLast();
		lista.removeLast();
		lista.removeLast();
		lista.removeLast();
		
	
		
		lista.show();
		
	}
	
	
	
	
	
	
	
}
