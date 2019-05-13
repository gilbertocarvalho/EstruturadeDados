
public class Arvore {

	

		public Node raiz;  

		//AAAAAAAAAAAAANode raiz da árvore 

		public Arvore() { 

		raiz = null; 

		} 

		// demais métodos 

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

			//achei o valor na árvore 

			if ((p.esq == null) && (p.dir == null)) {  

			//não tem filhos 

			return null; 

			} else if (p.esq == null) {  

			//tem apenas filho direito  

			//(subárvore direita) 

			return p.dir; 

			} else if (p.dir == null) {  

			//tem apenas filho esquerdo  

			//(subárvore esquerda) 

			return p.esq; 

			} else {  

			//tem dois filhos  

			//(subárvores esquerda e direita) 

			//continua... 

				r = p; 

				aux = p.dir; 

				while (aux.esq != null) {  

				//encontrar o descendente  

				//mais à esquerda na  

				//subárvore direita 

				r = aux; 

				aux = aux.esq; 

				} 

				p.element = aux.element; 

				if (r == p) {  

				//não entrou no laço while 

				r.dir = aux.dir; 

				} else { 

				r.esq = aux.dir; 

				} 

				return p; 

				} }

				//continua.. 
		
			 else if (p.element < valor) { 

				 remover(p.dir, valor);  

				 //remover na subárvore direita 

				 } else { 

				 remover(p.esq, valor);  

				 //remover na subárvore esquerda 

				 } 

				 return p; 

				 } 

				  
}

	
