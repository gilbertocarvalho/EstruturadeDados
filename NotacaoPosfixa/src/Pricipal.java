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
				
				if(c==(char)pilha.retornatopo()) {
					
					posfixa[i] = c;
					
				}
				else if((c=='+' || c=='-' ) && ((char)pilha.retornatopo()=='/' || (char)pilha.retornatopo()=='*')){
					
					
					posfixa[i]=(char)pilha.retornatopo();
					
					pilha.desempilha();
					
					
					
				}
				else if(!(c=='+' || c=='-' ) && ((char)pilha.retornatopo()=='/' || (char)pilha.retornatopo()=='*')) {
					
					
					posfixa[i] = c;
					
					
				}
			
			}
			else if(c==')'){
				
				
				posfixa[i]=(char)pilha.retornatopo();
				
				pilha.desempilha();
				
			}
			
			else if(c==')') {
				
				
				
				
			}
			
			else {
				
				posfixa[i] = c;
				
			}
			
			System.out.println(posfixa[i]);
			
			
		}
			
			
		
		
		
		
		
	
		
	}

}
