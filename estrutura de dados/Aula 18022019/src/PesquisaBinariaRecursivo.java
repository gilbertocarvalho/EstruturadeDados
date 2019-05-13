import java.util.Scanner;

public class PesquisaBinariaRecursivo {

	
	public static void main(String args[]) {
		
		
		int f[] = {0,1,2,4,5,7,8,9,12};
			
			
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		
		n = pesquisabinaria(0,9,n,f);
		
			if(n==-1)
			System.out.println("Número não encontrado");
			
			else
			System.out.println(n);
			
			
		
		
		
	}
	
	
	public static int pesquisabinaria(int comeco,int fim, int npesquisado ,int vetor[]) {
		
		if(comeco>=fim) {
			
			
			return -1;
			
			
		}
		
		
		
		
		int meio =  (int) ((comeco + fim)/2);
		
		int x=0;
		
	if(vetor[meio]==npesquisado){
			
			
			return meio;
			
			
		}
		
		
		
		
		
		
		
		
		
	
		else if(vetor[meio]>npesquisado){
			
			
			fim = meio - 1;
			
			 x = pesquisabinaria(comeco,fim,npesquisado,vetor);
			
			
			
		}
		else if(vetor[meio]<npesquisado){
			
			comeco = meio +1;
			
			
		x =	pesquisabinaria(comeco,fim,npesquisado,vetor);
			
		}
		
		
			
			
			return x;
		
	}
	
	
	
	
	
	
	
	
}
