package View;

import java.util.Scanner;

import EstruturasdeDados.Lista;
import EstruturasdeDados.ListaDupla;

public class Preencher {

	
	
	
	
	
	
	
	
	public Lista preencher(Lista f) {
	

		EstruturasdeDados.Lista lista = new EstruturasdeDados.Lista();
		
		String opc;
		do {
		
		System.out.println("\n 1 para inserir no inicio  \n 2 para excluir no inicio\n 3 para incluir no final\n 4 para retirar no final \n 5 para mostrar tamanho \n 9 para finalizar");
	
		 opc = leitura();
		
		
		
		switch(opc) {
		
		case "1": inserirnoComeco(lista);
		
		break;
		
		case "2" : excluirnoComeco(lista);
		
		break;
		case "3" : inserirnoFinal(lista);
		
		break;
		
		case "4" : excluirnoFinal(lista);
		
		break;
		
		case "5" : System.out.println(lista.getTamanho());
		
		break;
		
		}
		}while(!opc.equals("9"));
		
		return lista;
	}
	
	
	public ListaDupla preencher(ListaDupla lista) {
		

	
		
		String opc;
		do {
		
		System.out.println("\n 1 para inserir no inicio  \n 2 para excluir no inicio\n 3 para incluir no final\n 4 para retirar no final \n 5 para mostrar tamanho \n 9 para finalizar");
	
		 opc = leitura();
		
		
		
		switch(opc) {
		
		case "1": inserirnoComeco(lista);
		
		break;
		
		case "2" : excluirnoComeco(lista);
		
		break;
		case "3" : inserirnoFinal(lista);
		
		break;
		
		case "4" : excluirnoFinal(lista);
		
		break;
		
		case "5" : System.out.println(lista.getTamanho());
		
		break;
		
		}
		}while(!opc.equals("9"));
		
		return lista;
		
		
		
	}
	
	
	public static String leitura() {
		
		Scanner ler = new Scanner(System.in);
		return ler.next();
		
	}
	
	public static Lista inserirnoComeco(Lista lista){
		
		String n;
		System.out.println("Digite um número\n"
				+ "Digite t para parar");
		
	
		
		n = leitura();
		
		while(!n.equals("t")) {
		
		 
		 
			lista.InserirNoInicio(n);
			n = leitura();
		
	
		
	}
		lista.MostrarLista();
		return lista;
		
	}
	
	public static Lista excluirnoComeco(Lista lista) {
		
		String n;
		
		System.out.println("Digite 2 para retirar da lista\n"
				+ "Digite t para parar");
		do {

		
		 n = leitura();

		 if(!n.equals("t")) {
			 lista.RetirarnoInicio();
			 }
		 
		 lista.MostrarLista();}
		while(!n.equals("t"));
		
		return lista;
	}
	
	public static Lista inserirnoFinal(Lista lista) {

		
		
		
		
		String n;
		System.out.println("Digite um número\n"
				+ "Digite t para parar");
		
	
		
		n = leitura();
		
		while(!n.equals("t")) {
		
		 
		 
			lista.InserirnoFinal(n);
			n = leitura();
		
	
	
		
	}
		lista.MostrarLista();
		return lista;
	}

	public static Lista excluirnoFinal(Lista lista) {
		
String n;
		
		System.out.println("Digite 2 para retirar da lista\n"
				+ "Digite t para parar");
		do {

		
		 n = leitura();
		 
		 if(!n.equals("t")) {
		 lista.RetirarnoFinal();
		 }
		 
		 lista.MostrarLista();}
		while(!n.equals("t"));
		
		return lista;
		
	}

}
