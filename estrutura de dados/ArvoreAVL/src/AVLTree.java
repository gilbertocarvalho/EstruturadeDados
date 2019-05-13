


	public class AVLTree { 

		public  AVLNode raiz ;  

		//nó raiz da árvore 

		public AVLTree() { 

		raiz = null; 

		} 

		//Retorna a altura da árvore 

		public int altura(AVLNode t) { 

		return (t == null) ?  

		- 

		1 : t.altura; 

		} 

		//Retorna o maior valor entre ladoEsq e ladoDir 

		public int max(int ladoEsq, int ladoDir) { 

		return (ladoEsq > ladoDir) ? ladoEsq : ladoDir; 

		} 

		//continua... 
	
		//Retorna o fator de balanceamento 

		public int fatorDeBalanceamento(AVLNode t) { 

		return altura(t.esq)  

		- 

		altura(t.dir); 

		} 

		//Insere um elemento x na árvore AVL 

		public AVLNode inserir(AVLNode t, int x) { 

		if (t == null) { 

		t = new AVLNode(x, null, null); 

		} else if (x <= t.element) { 

		t.esq = inserir(t.esq, x); 

		} else if (x > t.element) { 

		t.dir = inserir(t.dir, x); 

		} 

		t = balanceamento(t); 

		return t; 

		} 

		//continua... 

		//Realiza o balanceamento da árvore 

		public AVLNode balanceamento(AVLNode t) { 

		if (fatorDeBalanceamento(t) == 2) { 

		//He > Hd: elemento inserido na subárvore esquerda 

		if (fatorDeBalanceamento(t.esq) > 0) { 

		//"positivo + positivo" = "reta" 

		t = rotacaoDireita(t); 

		} else { 

		//"positivo + negativo" = "joelho" 

		t = rotacaoEsquerdaDireita(t); 

		} 

		} else if (fatorDeBalanceamento(t) ==  

		- 

		2) { 

		//Hd > He: elemento inserido na subárvore direita 

		if (fatorDeBalanceamento(t.dir) < 0) { 

		//"negativo + negativo" = "reta" 

		t = rotacaoEsquerda(t); 

		} else { 

		//"negativo + positivo" = "joelho" 

		t = rotacaoDireitaEsquerda(t); 

		} 

		} 

		t.altura = max(altura(t.esq), altura(t.dir)) + 1; 

		return t; 

		} 

		//continua... 
		
		//Rotação Simples à Direita 

		public AVLNode rotacaoDireita(AVLNode p) { 

		AVLNode u = p.esq; 

		p.esq = u.dir; 

		u.dir = p; 

		p.altura = max(altura(p.esq), altura(p.dir)) + 1; 

		u.altura = max(altura(u.esq), p.altura) + 1; 

		return u; 

		} 

		//Rotação Simples à Esquerda 

		public AVLNode rotacaoEsquerda(AVLNode p) { 

		AVLNode z = p.dir; 

		p.dir = z.esq; 

		z.esq = p; 

		p.altura = max(altura(p.esq), altura(p.dir)) + 1; 

		z.altura = max(altura(z.dir), p.altura) + 1; 

		return z; 

		}  

		//continua... 
	
		 

		public AVLNode rotacaoEsquerdaDireita(AVLNode p) { 

		p.esq = rotacaoEsquerda(p.esq); 

		return rotacaoDireita(p); 

		} 

		//Rotação Dupla à Esquerda 

		public AVLNode rotacaoDireitaEsquerda(AVLNode p) { 

		p.dir = rotacaoDireita(p.dir); 

		return rotacaoEsquerda(p); 

		} 

		public String printTree(AVLNode p) { 

			String retorno; 

			retorno = "("; 

			if (p != null) { 

			retorno += " " + p.element + " "; 

			retorno += printTree(p.esq); 

			retorno += printTree(p.dir); 

			} 

			retorno = retorno + ") "; 

			return retorno; 

		} 

	

		} 
	

