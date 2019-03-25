
public class PilhaEstatica {

	Object pilha[];
	
	int topo;
	
	public int numerodeposicoes;
	
	public PilhaEstatica(int n){
		
		pilha = new Object[n];
		
		topo = -1;
		
		numerodeposicoes = n;
		
	}
	
	
	public boolean vazio() {
		
		
		if(topo==-1) {
			
			
			
			return true;
		}
		
		return false;
		
	}
	
	public boolean isFull() {
		
		
		if(topo==(numerodeposicoes-1)) {
			
			
			return true;
			
		}
		
		return false;
		
		
		
		
	}
	
	public void mostrartopo(){
		
		if(vazio()) {
			
			System.out.println("pilha vazia");
			
			
		}
		else {
		System.out.println( pilha[topo]);
		
		}
		
		
	
		
	}
	
	public Object retornatopo() {
		
		return (char) pilha[topo];
		
		
	}
	
	
	public void empilha(Object o) {
		
		if(isFull()) {
			
			System.out.println("Lista está cheia");
			
			
			
		}
		else {
			
			pilha[++topo] = o; 
			
		}
		
		
	}
	
	public void desempilha() {
		
		if(vazio()) {
			
			
			System.out.println("lista está vazio");
		}
		else {
			
			 pilha[topo--] = null;
			 
			 
			 
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
