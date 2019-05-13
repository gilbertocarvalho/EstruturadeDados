package EstruturasdeDados;

public class Lista {

	private Node inicio = null;
	
	private Node fim = null;
	
	private int tamanho =0;
	
	public boolean Vazio() {
		
		if(inicio==null) {
			
			
			return true;
		}
		else {
			
			
			return false;
		}
		
		
	}
	
	public void InserirNoInicio(String n) {
		
		
		Node novo = new  Node(n);
		if(Vazio()) {
		
		inicio = novo;
		
		fim = novo;
		
		tamanho++;
		}
		else {
			novo.setProximo(inicio);
			
			inicio = novo;
			tamanho++;
		}
		
	}
	
	public Node RetirarnoInicio(){
		
		Node retorno = inicio;
		
		if(!Vazio()) {
		
		if(inicio.getProximo()!=null ) {
			inicio = inicio.getProximo();
			tamanho--;
		}
		else {
			
			inicio = null;
			tamanho--;
		}
		}
		return retorno;
	}
	
	public void InserirnoFinal(String n) {
		
		Node novo = new Node(n);
		
		if(!Vazio()) {
			
			
				fim.setProximo(novo);
				fim = novo;
				tamanho++;
			
		}
		else {
			
			InserirNoInicio(n);

		}
		
	};
	
	public Node RetirarnoFinal() {
		
		Node retorno = fim;
		
		Node atual = inicio;
		if(!Vazio()) {
		
			
			if(inicio!=fim) {
				while(atual.getProximo()!=fim) {
			
					atual = atual.getProximo();
			
				}
				
				atual.setProximo(null);
				fim = atual;
				tamanho--;
			}
			else {
				
				RetirarnoInicio();
			}
		}
		
		return retorno;
	}
	
	
	public void MostrarLista(){
		
		if(!(Vazio())) {
		Node atual = inicio;
		
		
		while(atual!=null) {
			
			System.out.print(atual.getValor() + " ");
			
			atual = atual.getProximo();
		}
		
		
	}
	
		else
			System.out.println("Lista Vazia");
	}
	
	public int getTamanho() {

	
		
		
		return tamanho;
	}

	public Node getInicio() {
		
		return inicio;
	}

	public Node getFim() {

		
		return fim;
	}

	public void  setInicio(Node inicio) {
		
		this.inicio = inicio;
		
	}
	
	public void setFim(Node fim) {

		
		
		this.fim = fim;
	}
	



}
