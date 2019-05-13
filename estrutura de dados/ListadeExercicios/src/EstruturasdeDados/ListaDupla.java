package EstruturasdeDados;

public class ListaDupla extends Lista{

	private Dnode fim = null;

	private Dnode inicio = null;

	private int tamanho;

	public boolean Vazio() {
		
		if(inicio==null) {
			
			
			return true;
		}
		else {
			
			
			return false;
		}
		
		
	}
	
public void InserirNoInicio(String n) {
		
		
		Dnode novo = new  Dnode(n);
		if(Vazio()) {
		
		inicio = novo;
		
		fim = novo;
		
		tamanho++;
		}
		else {
			novo.setProximo(inicio);
			
			inicio.setAnterior(novo);
			
			inicio = novo;
			tamanho++;
		}
		
	}
	
public Node RetirarnoInicio(){
	
	Dnode retorno = inicio;
	
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
	
	Dnode novo = new Dnode(n);
	
	if(!Vazio()) {
		
		
			fim.setProximo(novo);
			novo.setAnterior(fim);
			fim = novo;
			tamanho++;
		
	}
	else {
		
		InserirNoInicio(n);

	}
	
};
	
public Dnode RetirarnoFinal() {
	
	Dnode retorno = fim;
	

	if(!Vazio()) {
	
		
		if(inicio!=fim) {
		fim = fim.getAnterior();
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
	Dnode atual = inicio;
	
	
	while(atual!=null) {
		
		System.out.print(atual.getValor() + " ");
		
		atual = atual.getProximo();
	}
	
	
}

	else
		System.out.println("Lista Vazia");
}

public Dnode getInicio() {
	
	return inicio;
	
}


public void setInicio(Dnode dnode) {

	
	this.inicio = dnode;
	
}


public Dnode getFim() {
	// TODO Auto-generated method stub
	return fim;
}

public int getTamanho() {
	
	return tamanho;
}

}
