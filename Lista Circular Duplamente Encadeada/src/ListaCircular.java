
public class ListaCircular {

	
	private Node primeiro ;
	
	private int tamanho ;
	
	
	public  ListaCircular(){
		
		primeiro = null;
		
		tamanho =0;
		
		
	}
	
	
	
	
	public boolean isEmpty() {
		
		if(tamanho==0) {
			
			
			return true;
			
			
		}
		else {
			
			
			return false;
		}
		
		
	}
	
	public Node getFist() {
		
		if(isEmpty()==true) {
			
			
			return null;
			
		}
		else {
			
			
			return primeiro;
		}
		
		
	}
	
	public Node getLast() {
		
		if(isEmpty()==true) {
			
			
			return null;
			
		}
		
		else {
			
			
			
			return primeiro.getAnterior();
		}
		
		
		
		
	}
	
	public void insertFist(Node n) {
		
		if(isEmpty()) {
			
			primeiro = n;
			
			primeiro.setProximo(primeiro);
			
			primeiro.setAnterior(primeiro);
			
		}
		else {
			
			n.setProximo(primeiro);
			
			n.setAnterior(primeiro.getAnterior());
			
			primeiro.getAnterior().setProximo(n);
			
			primeiro.setAnterior(n);
			
			primeiro = n;
			
		}
		
		tamanho++;
	}
	
	public void insertLast(Node n) {
		
		
		if(isEmpty()) {
			
			insertFist(n);
			
			
		}
		else {
			
			n.setAnterior(primeiro.getAnterior());
			n.setProximo(primeiro);
			primeiro.getAnterior().setProximo(n);
			primeiro.setAnterior(n);
			
			
			
		}
		
		tamanho++;
	}
	
	public Node removeFist() {
		
		if(isEmpty()) {
			
			
			return null;
		}
		else {
			
			Node n = primeiro;
			
			primeiro.getAnterior().setProximo(primeiro.getProximo());
			
			primeiro.getProximo().setAnterior(primeiro.getAnterior());
			
			primeiro = primeiro.getProximo();
			
			tamanho--;
			
			return primeiro;
		}
		
			
	}
	
	public Node removeLast(){
		
		if(isEmpty()) {
			
			
			return null;
		}
		else {
			
			
			Node n = primeiro.getAnterior();
			
			primeiro.getAnterior().getAnterior().setProximo(primeiro);;
			
			primeiro.setAnterior(primeiro.getAnterior().getAnterior());
			
			tamanho--;
			
			return n;
			
			
		}
		
		
	}
	
	public void show() {
		
		if(isEmpty()) {
			
			
			System.out.println("lista vazia");
		}
		else {
			
			Node  atual = primeiro;
			
			do {
				
				System.out.println(atual.getValor());
				
				atual  = atual.getProximo();
			}while(atual!=primeiro);
			
			
			
		}
		
		
		
	}
	
	
	
}
