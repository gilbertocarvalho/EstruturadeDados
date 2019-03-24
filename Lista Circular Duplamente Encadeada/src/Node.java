
public class Node {

	private Node anterior;
	
	private Node proximo;
	
	private String valor;
	
	
	
	
	public Node(String valor) {
		// TODO Auto-generated constructor stub
		
		
		this.valor =valor;
	}


	public void setAnterior(Node no) {
		
		
		anterior = no;
		
		
	}
	
	public Node getAnterior() {
		
		
		return anterior;
		
	}
	
	public void setProximo(Node no) {
		
		
		
		proximo = no;
		
	}
	
	
	
	public Node getProximo() {
		
		
		
		return proximo;
		
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
	
	
	
}
