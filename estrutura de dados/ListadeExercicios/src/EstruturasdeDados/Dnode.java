package EstruturasdeDados;

public class Dnode extends Node{

	private Dnode anterior;
	
	private Dnode proximo;
	
	public Dnode(String valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}



	public Dnode getAnterior() {
		return anterior;
	}



	public void setAnterior(Dnode anterior) {
		this.anterior = anterior;
	}



	public Dnode getProximo() {
		return proximo;
	}



	public void setProximo(Dnode proximo) {
		this.proximo = proximo;
	}

	
	
	
}
