public class AVLNode { 

public int element;  

//Elemento do n� � um inteiro 

public AVLNode esq;  

//Refer�ncia para o filho esquerdo 

public AVLNode dir;  

//Refer�ncia para o filho direito 

public int altura;  

//Altura do n� na �rvore 

//Construtor do node 

public AVLNode(int valor, AVLNode e, AVLNode d) { 

	element = valor; 

	esq = e; 

	dir = d; 

	altura = 0; 

} 

} 