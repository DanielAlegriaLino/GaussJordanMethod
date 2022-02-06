package main;

public class MetodoGaussJordan {
	
	static void imprimirMatriz(double matriz[][])
	{
		System.out.println();
	    for (int y = 0; y < matriz.length; y++)
	    {
	        for (int x = 0; x < matriz[0].length; x++)
	            System.out.print(matriz[y][x] + " ");
	        System.out.println();
	    }
	    System.out.println();
	}
	
	public static void obtenerMatrizEscalonada(double[][] matriz) 

	
	{
		int numero_incognitas= matriz[0].length-1;
		
		for(int x = 0 ; x < numero_incognitas; x++  ) 
		{
			if(matriz[x][x]== 0) 
			{
				int seq_search = 1;
				while( matriz[x+seq_search][x] == 0 && seq_search+x < numero_incognitas) 
				{
					seq_search++;
				}
				
				for(int k = 0; k <= numero_incognitas; k++) 
				{
					double temp = matriz[x][k] ;
					matriz[x][k] = matriz[x+seq_search][k];
					matriz[x+seq_search][k] = temp ;
				}
				
			}
			
			
			for(int y = 0; y < numero_incognitas; y++) 
			{
				//Ignorar las diagonales pues es lo primero que checamos 
				if(x==y) {continue;}
				
				double pivote = 0;
				pivote =  matriz[y][x]/matriz[x][x];
				
				for(int k = 0; k <= numero_incognitas; k++) 
				{
					matriz[y][k]= matriz[y][k] - matriz[x][k]*pivote;
				}
				
			}
			
		}

	}

	public static void imprimirResultadoDeMatrizEscalonada(double[][] matriz) 
	{
		int numero_incognitas= matriz[0].length-1;
		
		for( int i= 0; i<numero_incognitas; i++ ) 
		{
			System.out.println( matriz[i][numero_incognitas]/matriz[i][i]);
		}
		
	}
	
	
	
}
