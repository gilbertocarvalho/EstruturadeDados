
public class ListaCircular {

	private Node primeiro;
	
	private Node tail;
	
	private int tamanho ;
	
	public ListaCircular() {
		
		primeiro = null;
		
		tail = null;
		
		int tamanho = 0;
		
	}
	
	
	
	
	
	
	public boolean isEmpty() {
		
		if(primeiro==null) {
			
			
			return true;
			
		}
		else {
			
			
			return false;
			
		}
		
		
	}
	
	
	
	
	
	public Node getFist() {
		
		if(isEmpty()==true) {
			
			
			System.out.println("operação invalida");
			
			return null;
		}
		
		return primeiro;
		
		
	}
	
	
	public Node getLast() {
		
		if(isEmpty()==true) {
			
			
			System.out.println("operação invalida");
			
			return null;
		}
		
		
		
		return tail;
		
	}
	
	
	public void insertFist(Node node) {
		
		if(isEmpty()==true) {
			
			primeiro = node;
			
			tail =node;
			
			node.setProximo(node);
			
		}
		else {
			
			node.setProximo(primeiro);
			
			primeiro = node;
			
			tail.setProximo(primeiro);
			
			
		}
		
		
		
	}
	
	public void insertLast(Node node) {
		
		
		if(isEmpty()==true) {
			
			
			insertFist(node);
			
		}
		else {
			
			node.setProximo(primeiro);
			
			tail.setProximo(node);
			
			tail = node;
			
		}
		
		
	}
	
	public Node removeFist() {
		
		if(isEmpty()==true) {
			
			
			return null;
		}
		else {
			
			tail.setProximo(primeiro.getProximo());
			
			Node n = primeiro;
			
			primeiro = primeiro.getProximo();
			
			return n;
		}
		
		
		
		
		
	}
	
	public Node removeLast() {
		
		if(isEmpty()==true) {
			
			return null;
		}
		else {
			
			Node atual= primeiro;
			
			while(atual.getProximo()!=tail) {
				
				atual = atual.getProximo();
				
				
			}
			atual.setProximo(primeiro);
			
			Node n = tail;
			
			tail = atual;
			
			return  n;
			
		}
		
		
		
		
	}
	
	public void show() {
		
		if(isEmpty()) {
			
			System.out.println("lista vazia");
			
			
		}
		else {
			
			Node current = primeiro;
			do {
				
				System.out.println(current.getValor());
				
				current = current.getProximo();
				
			}while(current.getProximo()!=primeiro.getProximo());
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}
