import javax.swing.JOptionPane;

public class Interativo {

	public static void main (String args[]) {
		
		
		int vetor[] = {0,2,3,4,5,6,7,8,9,10};
		
		
		int p = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser pesquisado"));
		
		int e = 0;
		
		int d = 10;
		
		int meio = 10/2;
		
		int x;
		
		
		while(e<=d && p!=vetor[meio]) {
			
			
			if(vetor[meio]>p) {
				
				
				d = meio;
				
			}
			
			else{
				
				
				e = meio;
				
				
			}
			
		 x  = meio;
			
			meio = (e+d)/2;
			
		if(x==meio) {
			
			
			e = d+1;
		}
			
			
		}
		
		
		if(vetor[meio]==p) {
			
			
			System.out.println("O número está na posição "  + meio);
			
		}
		else {
			
			
			System.out.println("O número não foi encontrado");
		}
		
		
		
		
		
		
		
		
	}
	
/*	public static int[] CarregarVetor() {
		
		
		int n[] = new int[10];
		
		
		for(int i =0;i<10;i++) {
			n[i] = (int)  (Math.random()*10);
		
			System.out.println(n[i]);
			
		}
		
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				
					if(n[i]>n[j]) {
				
						int aux = n[j];
				
						n[j] =  n[i];
				
						n[i] = aux;
				
				}
				
			}
			
			
			
		}
		
		
		return n;
		
		
		
	} */
	
	
	
	
	
	
	
}
