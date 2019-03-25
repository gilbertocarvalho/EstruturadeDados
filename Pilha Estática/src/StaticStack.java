
public class StaticStack {
	
	
	
	
	
	public Object[] pilha;
	
	
	
	public int topo;
	
	
	/* Método Construtor */
	
	
	public StaticStack(int n) {
		
				this.topo = -1;
	
				this.pilha = new Object[n];
	
	
	
	}//demais métodos...}

	
	public boolean isEmpty() {
		
		if (this.topo == -1) {
		
		
		return true;
		}
	
	
	return false;
	
	
	}

	public boolean isFull() {
		if (pilha.length == topo + 1) {
			return true;
			
			
			}
		
		return false;}
	
	
	public int getSize() {
		
		return this.topo + 1;
		
	}

	
	public Object showTop() {
		
		if (this.isEmpty()) {
			
			return null;}
		
		return this.pilha[this.topo];
		
	
	}
	
	public void empilhar(Object element) {
		
		if (this.topo < this.pilha.length -1)
		
		{
			this.pilha[++topo] = element;
		
		
		}
		
	
	
	}
	
	public Object desempilhar() { 
		
		if (isEmpty()) {
			
			return null;
			}
		
		
		return this.pilha[this.topo--];
		
	}
	
	

	
	
}
