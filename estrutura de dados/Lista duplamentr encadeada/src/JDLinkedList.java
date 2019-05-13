
public class JDLinkedList {

	protected Node head; //node cabeça da lista
	protected Node tail; //node cauda da lista
	protected long size; //número de nodes da lista
	// Construtor default que cria uma lista vazia
	public JDLinkedList(){
	head = null;
	tail = null;
	size = 0;
	}
	//demais métodos...
	
	public boolean isEmpty() {
		return head == null;
		}
		public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
		throw new UnderflowException();
		}
		return head;
		}
		public Node getLast() throws UnderflowException {
		if (isEmpty()) {
		throw new UnderflowException();
		}
		return tail;
		}

		public void insertFirst(Node novoNode) {
			if (isEmpty()) {
			head = novoNode;
			tail = novoNode;
			size++;
			} else {
			novoNode.setNext(head);
			head.setPrevious(novoNode);
			head = novoNode;
			size++;
			}
			}	
		
		public void insertLast(Node novoNode) {
			if (isEmpty()) {
			insertFirst(novoNode);
			} else {
			tail.setNext(novoNode);
			novoNode.setPrevious(tail);
			tail = novoNode;
			size++;
			}
			}
		
		public Node removeFirst() throws UnderflowException {
			if (isEmpty()) {
			throw new UnderflowException();
			}
			Node removedItem = head;
			if (head == tail) {
			head = tail = null;
			} else {
			head.getNext().setPrevious(null);
			head = head.getNext();
			}
			size--;
			return removedItem;
			}
		
		public Node removeLast() throws UnderflowException {
			if (isEmpty()) {
			throw new UnderflowException();
			}
			Node removedItem = tail;
			if (head == tail) {
			head = tail = null;
			} else {
			tail.getPrevious().setNext(null);
			tail = tail.getPrevious();
			}
			size--;
			return removedItem;
			}
		
		public void show() {
			if (isEmpty()) {
			System.out.println("Lista vazia!");
			} else {
			System.out.print("A lista é: ");
			Node current = head;
			while (current != null) {
			System.out.print(current.getElement().toString() + " ");
			current = current.getNext();
			}
			System.out.println("\n");
			}
			}
		
		public void insertAfter(Node n, int pos) throws IndexOutOfBoundsException {
			if (pos < 0 || pos >= size) { //A lista inicia na posição 0
			throw new IndexOutOfBoundsException();
			}
			if (pos == size - 1) {
			insertLast(n);
			} else {
			long posAtual;
			Node current;
			if (pos < (size / 2)) {
			posAtual = 0;
			current = head;
			} else {
			posAtual = size - 1;
			current = tail;
			}

			if (current == head) {
				while (posAtual < pos) {
				current = current.getNext();
				posAtual++;
				}
				} else {
				while (posAtual > pos) {
				current = current.getPrevious();
				posAtual--;
				}
				}
				n.setNext(current.getNext());
				n.setPrevious(current);
				n.getNext().setPrevious(n);
				current.setNext(n);
				size++;
				}
				}
		
		public Node removeAfter(int posicao) throws IndexOutOfBoundsException, UnderflowException{
		
			if(isEmpty()) {
				
				throw new UnderflowException();
				
				
			}
			
			if(posicao<0 || posicao>=size) {
				
				throw new IndexOutOfBoundsException();
				
			}
			
			Node removido = null;
			
			if(posicao==size-1) {
				
				removeLast();
			}
			
			else if(posicao==0) {
				
				removeFirst();
			}
			
		
			
			else {
			
		
			
			long posicaoatual;
			
			Node current;
			
			if(posicao<(size/2)) {
				
				posicaoatual =0;
				
				current = head;
				
				
			}
			else {
				
				posicaoatual = size-1;
				
				current = tail;
				
				
			}
			
			if(current==head) {
				
				while(posicaoatual<posicao) {
				current = current.getNext();
				
				posicaoatual++;
				
				}
			}
			else {
				
				while(posicaoatual>posicao){
				current = current.getPrevious();
				
				posicaoatual--;
				
				}
			}
			
			removido = current.getNext();
			
			current.setNext(current.getNext().getNext());
			current.getNext().setPrevious(current);
			
			size--;
			
			}
			return removido;
		}
		
		public void insertBefore(Node node,int posicao) throws IndexOutOfBoundsException{
			
			if(posicao<0 || posicao>=size) {
				
				
				throw new IndexOutOfBoundsException();
				
				
			}
			
			
			if(posicao ==0) {
				
				insertFirst(node);
				
			}
			else {
				
				long posicaoatual;
				
				Node current;
				
				if(posicao<(size/2)) {
					
					current = head;
					
					posicaoatual=0;
					
					
				}
				else {
					
					current = tail;
					
					posicaoatual = (size-1);
					
					
				}
				
				
				if(current==head) {
					
					while(posicaoatual<posicao) {
						
						current = current.getNext();
						
						posicaoatual++;
						
						
					}
						
				}
				
				else {
					
					while(posicaoatual>posicao) {
						
						current = current.getPrevious();
						
						posicaoatual--;
						
						
					}
					
					
					
				}
				
				node.setNext(current);
				
				node.setPrevious(current.getPrevious());
				
				current.getPrevious().setNext(node);
				
				current.setPrevious(node);
				
				
			}
			
		
			
			
			
		}
		public void removeBefore (int posicao) throws IndexOutOfBoundsException {
			
			if(posicao<=0 || posicao>size) {
				
				throw new IndexOutOfBoundsException();
				
			}
			
			if(posicao==1) {
				
				try {
					removeFirst();
				} catch (UnderflowException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(posicao==size) {
				
				try {
					removeLast();
				} catch (UnderflowException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				
				Node current;
				
				long procurado;
				
				if(posicao<(size/2)) {
					
					
					current = head;
					
					procurado =0;
				}
				else {
					
					
					current = tail;
					
					procurado= (size-1);
				}
				
				
				if(current==head) {
					
					while(procurado<posicao) {
						
						current = current.getNext();
						
						procurado++;
						
					}
					
					
				}
				else {
					
					while(procurado>posicao) {
						
						current = current.getPrevious();
						
						procurado--;
						
					}
					
					
					
					
				}
				
				
				current.getPrevious().getPrevious().setNext(current);
				current.setPrevious(current.getPrevious().getPrevious());
				
				
				
				
			}
			
			
		}
		
	
}
