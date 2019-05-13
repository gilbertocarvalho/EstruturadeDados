package merge;

public class Principal {

	public static void main(String args[]) {
		
		int vetor[] = {99,10,6,23,74,57,34,32,54,76,45,23,765,3453,241};
		
		
		
		vetor =  Ordenar(vetor,vetor.length);
		
		
		for(int integers:vetor) {
			
			System.out.println(integers);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static int[]  Ordenar(int vetor[],int size){
		
		
		if(size==1){
			
			System.out.println("passou");
			return vetor;
			
		}
		else {
			
			if(size%2==0) {
				
				 int vetor1[] = new int[size/2];
				
				 int vetor2[] = new int[size/2];
				 
				 for(int i=0;i<(size/2);i++) {
					 
					 
					 vetor1[i] = vetor[i];
					 
					 
					 vetor2[i] = vetor[i+(size/2)];
					 
				 }
				 
				 

				 
				  vetor1 = Ordenar(vetor1,size/2);
				 
				 vetor2 = Ordenar(vetor2,size/2);
				 
				 int t= 0;
				 
				 int t1 =0;
				 
				 int t2 =0;
				 
				 while(t<size) {
					 
				
						
					if(t1<(size/2))	{
						if(t2<size/2) {
					 if(vetor1[t1]<vetor2[t2] ) {
						 
						 vetor[t] = vetor1[t1];
						 
						 t1++; 
					 }
					 else {
						 
						 vetor[t] = vetor2[t2];
						 
						 t2++; 
						 
					 }
						}
						else {
							
							 vetor[t] = vetor1[t1];
							 
							 t1++; 
							
							
							
						}
						
						
					}
					else {
						vetor[t] = vetor2[t2];
						 
						 t2++;
						
						
					
					}
					 t++;
					 
				 }
				 
				 
				 
				 
			}
			else {
				
				int v1[] = new int[size/2];
				
				int v2[] = new int[(size/2)+1];
				
				
				for(int i=0;i<(size/2);i++) {
					
					v1[i] = vetor[i];
					
					v2[i] = vetor[i +(size/2)];
					
					if(i==(size/2)-1) {
						
						v2[i+1] = vetor[i+((size/2)+1)];
						
						
					}
					
				}
				
				v1 = Ordenar(v1,size/2);
				
				v2 = Ordenar(v2,(size/2)+1);
				
				int t= 0;
				 
				 int t1 =0;
				 
				 int t2 =0;
				 
				 while(t<size) {
					
					 String c = "2";
					
					 if(t1<(size/2)) {
						 if(t2<((size/2)+1)) {
					 if (v1[t1]<v2[t2]) {
						 
						 vetor[t] = v1[t1];
						 
						 t1++; 
						
					 }
					 else{
						 
						 
						 vetor[t] = v2[t2];
						 
						 t2++; 
						 
						 
						
					 }
						 }
						 else {
							 
							 vetor[t] = v1[t1];
							 
							 t1++; 
						 }
						 
						 
					 }
					 else {
						 vetor[t] = v2[t2];
						 
						 t2++;
						 
						 
					 }
				 
					 t++;
					 
				 }
			}
			
			
			
			
			return vetor;
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
