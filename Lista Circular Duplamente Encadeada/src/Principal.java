
public class Principal {

	public static void main(String args[]) {
		
		
		
		
		
		
	ListaCircular lista = new ListaCircular();
		
		
		lista.show();
		
	lista.insertFist(new Node("w"));
	
	lista.insertFist(new Node("w2"));
	
	lista.insertFist(new Node("w3"));
	
	lista.insertLast(new Node("w4"));
	
	System.out.println(lista.getLast().getValor());
	
	
	lista.show();
	}
	
	
	
	
	
}
