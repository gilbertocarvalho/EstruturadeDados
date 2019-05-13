
public class Arvore {

	

		public Node raiz;  

		//AAAAAAAAAAAAANode raiz da �rvore 

		public Arvore() { 

		raiz = null; 

		} 

		// demais m�todos 

		public void inserir(Node p, int valor) { 

			if (p == null) { 

			raiz = new Node(valor, null, null); 

			} else if (valor <= p.element) { 

			if (p.esq != null) { 

			inserir(p.esq, valor); 

			} else { 

			p.esq = new Node(valor, null, null); 

			} 

			} else if (valor > p.element) { 

			if (p.dir != null) { 

			inserir(p.dir, valor); 

			} else { 

			p.dir = new Node(valor, null, null); 

			} 

			} 

			} 

		public String printTree(Node p) { 

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

		public boolean buscarnumero(Node p,int n) {
			
			 

				if (p != null) { 

					if(p.element==n) {
					
					
						return true;
						
						
				
					}
					else {
						
						
					return	(buscarnumero(p.esq,n) ||buscarnumero(p.dir,n)); 

					}
					
					
				} 

				return false;
			
			
		}
		
		public Node remover(Node p, int valor) { 

			Node aux, r = null; 

			if (p.element == valor) {  

			//achei o valor na �rvore 

			if ((p.esq == null) && (p.dir == null)) {  

			//n�o tem filhos 

			return null; 

			} else if (p.esq == null) {  

			//tem apenas filho direito  

			//(sub�rvore direita) 

			return p.dir; 

			} else if (p.dir == null) {  

			//tem apenas filho esquerdo  

			//(sub�rvore esquerda) 

			return p.esq; 

			} else {  

			//tem dois filhos  

			//(sub�rvores esquerda e direita) 

			//continua... 

				r = p; 

				aux = p.dir; 

				while (aux.esq != null) {  

				//encontrar o descendente  

				//mais � esquerda na  

				//sub�rvore direita 

				r = aux; 

				aux = aux.esq; 

				} 

				p.element = aux.element; 

				if (r == p) {  

				//n�o entrou no la�o while 

				r.dir = aux.dir; 

				} else { 

				r.esq = aux.dir; 

				} 

				return p; 

				} }

				//continua.. 
		
			 else if (p.element < valor) { 

				 remover(p.dir, valor);  

				 //remover na sub�rvore direita 

				 } else { 

				 remover(p.esq, valor);  

				 //remover na sub�rvore esquerda 

				 } 

				 return p; 

				 } 

				  
}

	
