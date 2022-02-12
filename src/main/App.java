package main;


public class App {

	
	public static void main(String[] args)
	{
		
		
	    Matriz matriz1 = new Matriz(new double[][]  {
    		{ 1, 2, 1, 0 },
            { 1, -1, 3, 6 },
            { 2, 1, -1, 1 }
            });
	    
	    matriz1.resolverMatriz();
	    matriz1.imprimirMatriz();
	    
	    
	    
	    
	    Matriz matriz2 = new Matriz(new double[][]  {
    		{ 1, -1, 3, 13 },
            { 1, 1, 1, 11 },
            { 2, 2, -1, 7 }
            });
	    
	    matriz2.resolverMatriz();
	    matriz2.imprimirMatriz();
	    
	    
	    
	    Matriz matriz3 = new Matriz(new double[][]  {
    		{ 5, -2,  5, -5, 6, -8,  9 },
            { -6, 6 , -3, 1, 4, -8, -5},
            { -5, 5,  -7, 3,-4,  3,  21},
            {-1, -4, -9,  6,  9,  5, 26},
            {7 , 5,  -8, -4 ,7, -6, 65},
            {4, -1,  -3,  5, -3, -5, 149}
            });
	    
	    matriz3.resolverMatriz();
	    matriz3.imprimirMatriz();
	    
	    
	    
	}

}
