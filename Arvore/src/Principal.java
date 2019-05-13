import java.util.Scanner;

public class Principal {

	public static void main(String args[]) { 

		
		Scanner ler = new Scanner (System.in);
		
		Arvore arvore = new Arvore(); 

		arvore.inserir(arvore.raiz, 50); 

		arvore.inserir(arvore.raiz, 40); 

		arvore.inserir(arvore.raiz, 60); 

		arvore.inserir(arvore.raiz, 35); 

		arvore.inserir(arvore.raiz, 45); 

		arvore.inserir(arvore.raiz, 55); 

		arvore.inserir(arvore.raiz, 65); 

		arvore.inserir(arvore.raiz, 61); 
		
		System.out.println(arvore.printTree(arvore.raiz)); 
		
		
		System.out.println("Digite o numero a ser procurado");
		while(ler.hasNext()) {
		
	
		
		
		
		if(arvore.buscarnumero(arvore.raiz,ler.nextInt())) {
			
			System.out.println("numero está na árvore");
			
		}else {
			
			
			System.out.println("numero não está na árvore");
		}

		System.out.println("Digite o numero a ser procurado");
		}
		
		} 
	
	
	
	
	
}
