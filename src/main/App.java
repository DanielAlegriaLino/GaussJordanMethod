package main;

public class App {

	
	public static void main(String[] args)
	{
	
	    Matriz matriz1 = new Matriz(new double[][]  {
    		{ 1, 2, 1, 0 },
            { 1, -1, 3, 6 },
            { 2, 1, -1, 1 }
            });
	    
	    matriz1.getMatrizEscalonada();
	    matriz1.getResultadosDeMatrizEscalonadaSimplificados();
	    matriz1.imprimirMatriz();
	    
	    
	    
	    
	    Matriz matriz2 = new Matriz(new double[][]  {
    		{ 1, -1, 3, 13 },
            { 1, 1, 1, 11 },
            { 2, 2, -1, 7 }
            });
	    
	    matriz2.getMatrizEscalonada();
	    matriz2.getResultadosDeMatrizEscalonadaSimplificados();
	    matriz2.imprimirMatriz();
	    
	    
	}

}
