
public class Node {

	private String valor;
	
	private Node proximo;
	
	
	
	public Node(String string) {
		
		
		valor = string;
		
		proximo =null;
		
	}
	
	public void setProximo(Node no) {
		
		
		
		proximo = no;
		
		
		
	}
	
	public Node getProximo() {
		
		
		
		return proximo;
		
	}
	
	public String getValor(){
		
		
		return valor;
	}
	
	
	
	
}
