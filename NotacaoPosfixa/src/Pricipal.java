import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner ler = new Scanner(System.in);
		
		String lido = ler.nextLine();
		
		PilhaEstatica pilha = new PilhaEstatica(lido.length());
		
		char d[] = lido.toCharArray();
			
		char posfixa[] = new char[d.length];
		
		int i=0;
		for(char c: d) {
			
			
			if(c == '(') {
		
				pilha.empilha(c);
				
			}
			else if(c == '*' || c == '/' || c == '+' || c =='-'){
				
				
				 if(pilha.vazio()) {
					
					pilha.empilha(c);
				}
				 else if(c==(char)pilha.retornatopo() ) {
					
					posfixa[i] = c;
					i++;
				}
				
				else if((char)pilha.retornatopo()=='(') {
					
					pilha.empilha(c);
					
				}
				
				
				else if((c=='+' || c=='-' ) && ((char)pilha.retornatopo()=='/' || (char)pilha.retornatopo()=='*')){
					
					
					posfixa[i]=(char)pilha.retornatopo();
					i++;
					pilha.desempilha();
					pilha.empilha(c);
					
					
				}
			
				
				
				else if(!(c=='+' || c=='-' ) && !((char)pilha.retornatopo()=='/' || (char)pilha.retornatopo()=='*')) {
					
					
					
					
					posfixa[i] = c;
					posfixa[i+1] = (char) pilha.retornatopo();
					
					pilha.desempilha();
					i = i+2;
				
					
					
				}
			
			}
			else if(c==')'){
				
				if((char)pilha.retornatopo()!='(') {
					posfixa[i]=(char)pilha.retornatopo();
					i++;
				pilha.desempilha();
				}
				else {
					pilha.desempilha();
					if(!pilha.vazio())  {
					posfixa[i]=(char)pilha.retornatopo();
					pilha.desempilha();
					i++;
					}
				}
				
				
				
			}
			
	
			
			else {
				
				
				posfixa[i] = c;
				i++;
			}
		
			
			
		}
		
		while(!pilha.vazio()) {
			
			
			if((char)pilha.retornatopo()!='(') {
			posfixa[i] = (char)pilha.retornatopo();
			i++;
			}
			
			pilha.desempilha();
		}
		
		
	for(int j=0;j<pilha.numerodeposicoes;j++)
		if(posfixa[j]!=' ')
			System.out.print(posfixa[j]);
			
	}
		
		
		
		
	
		
	}

