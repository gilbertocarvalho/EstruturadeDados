
public class Principal {

	public static void main(String args[]) {
		
		
		StaticStack pilha = new StaticStack(7);pilha.empilhar("1");
		
		
		pilha.empilhar("2");
		
		pilha.empilhar("3");
		
		pilha.empilhar("4");
		
		pilha.empilhar(5);
		
		while (pilha.isEmpty() == false) {                   
			
			
			System.out.println(pilha.desempilhar());
			
		}
		
	}


}
