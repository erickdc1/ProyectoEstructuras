

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Scanner scL= new Scanner(System.in);
		
		boolean bol;
		int opc, maxVert = 20;
		GrafoMatriz grafoMatriz = new GrafoMatriz(maxVert);
		String nomVert, nomX, nomY;
		int cont = 0;
		String nVert;
		opc=0;
		while(opc!=1) {
		System.out.println("1.Salir");
		System.out.println("2.Ingresar Vertice");
        System.out.println("3.Numero de vertice");
        System.out.println("4.Nuevo Arco");
        System.out.println("5.Verificar Adyacencia");
        System.out.println("6.Puntos Articulacion");

        
        opc = sc.nextInt();
        switch(opc) {
        
        case 1:
        	System.out.print("ADIOS");
        	break;
        case 2:
        	System.out.print("Introduce el nombre del vertice");
        	nomVert = scL.nextLine();
        	grafoMatriz.nuevoVertice(nomVert);
            cont++;
        	break;
        case 3:
        	System.out.print("Introduce el vertice a consultar su numero");
        	nomVert=scL.nextLine();
        	int numVert=grafoMatriz.numVertice(nomVert);
        	System.out.print("# Vertice: "+numVert);
        	break;
        case 4:
        	System.out.print("Introduce el nombre del primer vertice a conectar");
        	nomX=scL.nextLine();
        	System.out.print("Introduce el nombre del segundo vertice a conectar");
        	nomY=scL.nextLine();
        	grafoMatriz.nuevoArco(nomX, nomY);
        	break;
        case 5:
        	System.out.println("Introduce el nombre del primer vertice");
    		nomX=scL.nextLine();
    		System.out.println("Introduce el nombre del segundo vertice");
    		nomY=scL.nextLine();
    		bol=grafoMatriz.adyacente(nomX, nomY);
    		if(bol==true) {
    			System.out.println("Si hay adyacencia entre los vertices");
    		} else {
    			System.out.println("No hay adyacencia entre los vertices");
    		}
        	break;
        case 6:
        	System.out.print("Introduce el numero del vertice: ");
        	nVert = scL.nextLine();
    		int [] num = new int [grafoMatriz.numVertice(nVert)];
    		int [] bajo = new int [grafoMatriz.numVertice(nVert)];
    		int [] arista = new int [grafoMatriz.numVertice(nVert)];
    		boolean [] visitado = new boolean[grafoMatriz.numVertice(nVert)];
    		for (int i = 0; i < grafoMatriz.numVertice(nVert); i++) {
    			visitado[i] = false;	
    		}
    		grafoMatriz.puntosArticulacion(grafoMatriz, maxVert, num, cont, visitado, arista, bajo);
    		break;
        default:
        	System.out.print("INGRESA OPCION VALIDA");
        	}
		}
        sc.close();
        scL.close();
	}
}
