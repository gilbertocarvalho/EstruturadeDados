
public class Node {

	
	private String element; //Elemento do DNode é uma string
	private Node previous; //Referência para um objeto DNode
	private Node next; //Referência para um objeto DNode
	//Cria um node com um elemento e duas referências
	public Node(String s, Node p, Node n) {
	setElement(s);
	setPrevious(p);
	setNext(n);
	}
	//Cria um node com um elemento e duas referências null
	public Node(String element) {
	this(element, null, null);
	}
	//métodos getters e setters...
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	
	
	
	
	
}
