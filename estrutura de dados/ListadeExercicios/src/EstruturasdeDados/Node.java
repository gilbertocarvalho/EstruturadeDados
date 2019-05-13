package EstruturasdeDados;

public class Node {

	private String valor;
	
	private Node proximo= null;
	
	public Node(String valor) {
		
		
		this.valor = valor;
		
	}
	
	

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public int getValor() {
		return Integer.parseInt(valor);
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
}
