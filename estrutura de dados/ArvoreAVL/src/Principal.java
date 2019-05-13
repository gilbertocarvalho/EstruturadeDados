
public class Principal {

	
	public static void main(String[] args) {
		
		
		AVLTree arvore = new AVLTree(); 

		
		
		arvore.raiz = arvore.inserir(arvore.raiz, 1); 

		arvore.raiz = arvore.inserir(arvore.raiz, 2); 
		arvore.raiz = arvore.inserir(arvore.raiz, 3); 

		arvore.raiz = arvore.inserir(arvore.raiz, 4); 

		arvore.raiz = arvore.inserir(arvore.raiz, 5); 

		arvore.raiz = arvore.inserir(arvore.raiz, 6); 

		arvore.raiz = arvore.inserir(arvore.raiz, 7); 

		System.out.println(arvore.printTree(arvore.raiz));; 
		
		
	}
	
	

	
}
