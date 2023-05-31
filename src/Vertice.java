

public class Vertice{
	String nombre;
	int numVertice;
	
	public Vertice(String x){
		nombre=x;
		numVertice = -1;
	}
	//Regresa el nombre del vertice
	public String nomVertice() {
		return nombre;
	}
	//Si dos vertices son iguales entonces verdadero
	public boolean equals(Vertice n) {
		return nombre.equals(n.nombre);
	}
	//Asigna el # de vertices
	public void asigVert(int n) {
		numVertice=n;
	}
	//Regresa un string con el nombre y número de vertice
	public String toString() {
		return nombre+ " (" + numVertice +")";
	}
	

}
