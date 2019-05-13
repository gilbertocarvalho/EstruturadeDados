package View;

import EstruturasdeDados.Dnode;
import EstruturasdeDados.Lista;
import EstruturasdeDados.ListaDupla;
import EstruturasdeDados.Node;

public class Exec7 {

	public static void main(String[] args) {
		
		exec12();
		
		
		/*Dnode dnode = new Dnode("xx");
		
		Dnode dnode2 = new Dnode("x2");
		
		dnode.setProximo(dnode2);
		
		dnode2.setAnterior(dnode);
		
		System.out.println(dnode.getValor());
		*/
	}
	
	
	
	public static void exec7(){
		
		
		Lista l  = new Lista();
		
		Lista l2 = new Lista();
		Preencher  a = new Preencher();
		
		
		System.out.println("Preencha a primeira lista ");
		l = a.preencher(l);
		
		System.out.println("Preencha a segunda lista");;
		
		l2 = a.preencher(l2);
		
		if(exercicio7(l, l2)) {
			
			
			System.out.println("Listas idênticas");
			
		}
		else {
			
			
			System.out.println("Listas não idênticas");
		}
		
	}
	
	public static void exec8() {
		
		Lista lista = new Lista();
		
		Preencher p = new Preencher();
		
		lista = p.preencher(lista);
		
		
		
		Node fim = lista.getFim();
		Node atual = lista.getInicio();
		
		while(lista.getInicio()!=fim) {
			
					atual = lista.getInicio();
				while(atual.getProximo()!=fim) {
					
					atual = atual.getProximo();
				}
				
				fim.setProximo(atual);
				
				fim = atual;
				
		
		
	
		}
		
		fim.setProximo(null);
		
		lista.setInicio(lista.getFim());
		lista.setFim(fim);
		
		
		lista.MostrarLista();
		
	}
	
	public static void exec9() {
		
		Lista l =  new Lista();
		
		Preencher p = new Preencher();
		
		l = p.preencher(l);
		
		 Node p2  = l.getInicio();
		
		 Node p1=p2;
		while(p2.getProximo()!=null) {
			
			p1 = p1.getProximo();
			
			p2 = p2.getProximo();
			
			if(p2.getProximo()!=null) {
				
				p2 = p2.getProximo();
			}
			
		}
		
		System.out.println(p1.getValor());
	}
	
	public static void exec10() {
		
		
		ListaDupla l  = new ListaDupla();
		
		Preencher p = new Preencher();
		
		l = p.preencher(l);
		
		System.out.println("Digite o valor a ser enserido na lista");
		
		String n = p.leitura();
		
		Dnode novo = new Dnode(n);
		
		System.out.println("Digite a posição a ser colocado");
		
		int pos = Integer.parseInt(p.leitura());
		
		Dnode atual = l.getInicio();
		
		if(pos<1 || pos>l.getTamanho()) {
			
			
			System.out.println("Posição invalida");
		}
		
		else {
			
			
			for(int i =1;i<pos;i++) {
				
				atual = atual.getProximo();
			}
				
			novo.setProximo(atual.getProximo());
			
			atual.getProximo().setAnterior(novo);
			
			novo.setAnterior(atual);
			atual.setProximo(novo);
			
			l.MostrarLista();
		}
		
		
	}
	
	public static void exec11() {
		
		ListaDupla n1 = new ListaDupla();
		
		Preencher  p = new Preencher();
		
		ListaDupla n2 = new ListaDupla();
		
		n1 = p.preencher(n1);
		
		n2 = p.preencher(n2);
		
		int c1 = 0;
		
		int c2 = c1;
		
	
		Dnode atual = n1.getFim();
		
		Dnode atual2= n2.getFim();
		
		Lista  resultado = new Lista();
		int n =0;
		while(c1<n1.getTamanho() && c2<n2.getTamanho()) {
			
			
					
			n = n +atual.getValor() + atual2.getValor();
			
			resultado.RetirarnoInicio();
			resultado.InserirNoInicio(n%10+"");
			
			n = n/10;
			
			resultado.InserirNoInicio(n+"");
			atual = atual.getAnterior();
			
			atual2 = atual2.getAnterior();
			c1++;c2++;
		}
		
		
		if(resultado.getInicio().getValor()==0)
			resultado.RetirarnoInicio();
		
		resultado.MostrarLista();
		
	}
	
	public static void exec12() {
		
		ListaDupla lista1 = new ListaDupla();
		
		ListaDupla lista2 = new ListaDupla();
		
		Preencher p = new Preencher();
		System.out.println("Preencha o conjunto A");
		lista1 = p.preencher(lista1);
		
		System.out.println("Preencha o conjunto B");
		lista2 = p.preencher(lista2);
		
		
		
		int opc = 0;
		
		while(opc!=9) {
			System.out.println("\n Digite 1 para fazer uma intersecção\n Digite 2 para uma união\n Digite 9 pra finalizar");
			
			 opc = Integer.parseInt(p.leitura());
			
		switch(opc) {
		
		
		case 1: inteseccao(lista1, lista2);
			
			break;
			
		case 2 : uniao(lista1,lista2);
		
			break;
			
		case 3 :	System.out.print("Diferença entre A e B  : ");diferenca(lista1,lista2);
					System.out.print("\n Diferença entre B e A  : "); diferenca(lista2,lista1);
			break;
		}
		}
		
	}
	
	public static void inteseccao(ListaDupla l1,ListaDupla l2) {
		
		int c1 = 0;
		
		int c2 = 0;
		
			ListaDupla ld = new ListaDupla();
		
			Dnode atual2 = l1.getInicio();
		
			while(c1<l1.getTamanho() ) {
				
			  Dnode atual = l2.getInicio();
				
			  while(atual!=null) {
				  
				  if(atual2.getValor()==atual.getValor()) {
					  
					  ld.InserirNoInicio(atual.getValor()+"");
				  }
				  
				  atual = atual.getProximo();
				   
			  }
			  
			  atual2 = atual2.getProximo();
			  c1++;
			}
		
		ld.MostrarLista();
	}
	
	public static void uniao(ListaDupla l1,ListaDupla l2) {
		
		
		ListaDupla uniao = new ListaDupla();
		
		Dnode atual = l1.getInicio();
		
		while(atual!=null) {
			
			uniao.InserirNoInicio(atual.getValor()+"");
			
			atual = atual.getProximo();
			
			
		}
		
		atual = l2.getInicio();
		
		
		while(atual!=null) {
			
		boolean valornaoinserido = true;
		
		Node atualuniao = uniao.getInicio();
		
		while(valornaoinserido && atualuniao!=null) {
			
			if(atual.getValor()==atualuniao.getValor()) {
				
				
				valornaoinserido=false;
			}
			
			atualuniao =atualuniao.getProximo();
		}
			
			
		
		if(valornaoinserido) {
			uniao.InserirNoInicio(atual.getValor()+"");
			
			
			
		}
			atual = atual.getProximo();
		}
		
		
		
		uniao.MostrarLista();
	}
	
	public static void diferenca(ListaDupla l1,ListaDupla l2) {
		
		ListaDupla ld = new ListaDupla();
		
		Dnode atual = l1.getInicio();
		
		
		
		
		while( atual!=null) {
			
			boolean valornaoexistente = true;
			
			Dnode atuall2 = l2.getInicio();
			
			while(atuall2!=null && valornaoexistente) {
			
				if(atual.getValor()==atuall2.getValor()) {
				
					valornaoexistente = false;
				
				}
				atuall2 = atuall2.getProximo();
			}
			
			if(valornaoexistente) {
				
				ld.InserirNoInicio(atual.getValor()+"");
			}
			
			atual = atual.getProximo();
		}
		
		ld.MostrarLista();
		
	}
	
	public static boolean exercicio7(Lista l,Lista l2) {
		
	
		
		if(l.getTamanho()==l2.getTamanho()) {
			
			Node atuall = l.getInicio();
			
			Node atuall2 = l2.getInicio();
			
			while(atuall!=null) {
				
				if(atuall.getValor()!=atuall2.getValor()) {
					
					return false;
				}
				
				atuall = atuall.getProximo();
				atuall2 = atuall2.getProximo();
			}
			
			return true;
		}
		else {
			
			return false;
		}
		
		
	}
	
	

	
	
}
