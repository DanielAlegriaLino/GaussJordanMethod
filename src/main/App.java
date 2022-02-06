package main;

public class App {

	
	public static void main(String[] args)
	{
		
	    double matriz_ejemplo[][] = {
	    		{ 1, 2, 1, 0 },
	            { 1, -1, 3, 6 },
	            { 2, 1, -1, 1 }};
	                 
	    
	    MetodoGaussJordan.imprimirMatriz(matriz_ejemplo);
	    MetodoGaussJordan.obtenerMatrizEscalonada(matriz_ejemplo);
	    MetodoGaussJordan.imprimirMatriz(matriz_ejemplo);
	    MetodoGaussJordan.imprimirResultadoDeMatrizEscalonada(matriz_ejemplo);

	}

}
