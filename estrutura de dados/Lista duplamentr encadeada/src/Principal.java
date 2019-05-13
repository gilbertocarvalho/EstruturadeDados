import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {

	public static void main(String args[]) {
	JDLinkedList lista = new JDLinkedList();
		try {
		lista.insertFirst(new Node("D"));
		lista.insertFirst(new Node("A"));
		lista.insertFirst(new Node("B"));
		lista.insertLast(new Node("S"));
		lista.insertLast(new Node("C"));
		lista.insertLast(new Node("T"));
		lista.insertLast(new Node("A"));
		lista.insertLast(new Node("R"));
		lista.insertLast(new Node("D"));
		lista.insertLast(new Node("E"));
		lista.removeFirst(); //pode lançar UnderflowException
		//lista.removeLast(); //pode lançar UnderflowException
		lista.removeAfter(2);
		lista.insertBefore(new Node(" "),3 );
		
		} catch (UnderflowException e) {
		System.out.println("ERRO: Impossível remover!");
		e.printStackTrace();
		}
		lista.show();
	  /*  ArrayList<String> vetor = new ArrayList<String>();
	    LinkedList<String> lista = new LinkedList<String>();
	    int numeroDeElementos = 40000;

	    // ADICIONADO NO COMEÇO
	    
	    long inicio = System.currentTimeMillis();

	    for (int i = 0; i < numeroDeElementos; i++) {
	      vetor.add(0, "" + i);
	    }

	    long fim = System.currentTimeMillis();
	    System.out.println("Vetor adiciona no começo: " + (fim - inicio)
	        / 1000.0);

	    inicio = System.currentTimeMillis();

	    for (int i = 0; i < numeroDeElementos; i++) {
	      lista.add(0, "" + i);
	    }

	    fim = System.currentTimeMillis();
	    System.out.println("Lista Ligada adiciona no começo: " + 
	      (fim - inicio) / 1000.0);


	    // PERCORRENDO
	    inicio = System.currentTimeMillis();

	    for (int i = 0; i < numeroDeElementos; i++) {
	      vetor.get(i);
	    }

	    fim = System.currentTimeMillis();
	    System.out
	      .println("Vetor percorrendo: " 
	      + (fim - inicio) / 1000.0);

	    inicio = System.currentTimeMillis();

	    for (int i = 0; i < numeroDeElementos; i++) {
	      lista.get(i);
	    }

	    fim = System.currentTimeMillis();
	    System.out.
	      println("Lista Ligada percorrendo: " 
	      + (fim - inicio) / 1000.0);
	    
	    
	    // REMOVENDO DO COMEÇO
	    inicio = System.currentTimeMillis();

	    for (int i = 0; i < numeroDeElementos; i++) {
	      vetor.remove(0);
	    }
	    
	    fim = System.currentTimeMillis();
	    System.out
	      .println("Vetor remove do começo: " 
	      + (fim - inicio) / 1000.0);

	    inicio = System.currentTimeMillis();

	    for (int i = 0; i < numeroDeElementos; i++) {
	      lista.remove(0);
	    }

	    fim = System.currentTimeMillis();
	    System.out.println("Lista Ligada remove do começo: " 
	      + (fim - inicio) / 1000.0);
		
		

		}
	
}*/
	}
}