
	public class grafos1 {
	private final int MAXIMO_VERTICES;
	private final int MAXIMO_ARISTAS;
	private int aristas;
	private int matrix[][];
	
	//Este metodo crea un grafo con la instrucción por parámetros en los que se indican el número de vertices y el número de aristas
	//Estos se almacenan en maximo de vertices y maximo de arista

	public grafos1(int nroVertices, int nroAristas) {
	MAXIMO_VERTICES = nroVertices;
	MAXIMO_ARISTAS = nroAristas;
	
	this.aristas = 0;
	
	matrix = new int[MAXIMO_VERTICES][MAXIMO_VERTICES];
	
	for (int i = 0; i < getMAX_VERTICES(); i++) {
	for (int j = 0; j < getMAX_VERTICES(); j++) {
	matrix[i][j] = 0;
	}
	}
	}
	
	//Constructor del objeto grafos para el número de vertices
	public grafos1(int nroVertices) {
	this(nroVertices, nroVertices);
	}
	//Regresa el máximo de vertices
	public int getMAX_VERTICES() {
	return MAXIMO_VERTICES;
	}
	//Regresa el máximo de aristas
	public int getMAX_ARISTAS() {
	return MAXIMO_ARISTAS;
	}
	
	//Este método inserta una arista entre dos vértices con una distancia especificada, si excede el rango de nuestra matriz nos regresará un error
	public void insertaArista(int v1, int v2, int dist)
	throws ArrayIndexOutOfBoundsException, UnsupportedOperationException {
	if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
	throw new ArrayIndexOutOfBoundsException(
	"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
	} else if (aristas == MAXIMO_ARISTAS) {
	throw new UnsupportedOperationException("No se puede añadir más aristas");
	} else {
	matrix[v1][v2] = dist;
	}
	}
	
	//Este método evalúa la existencia de una arista entre dos nodos de una sola dirección, v1 es el nodo que apuntará a v2
	public boolean existeArista(int v1, int v2) {
	if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
	throw new ArrayIndexOutOfBoundsException(
	"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
	} else if (matrix[v1][v2] != 0) {
	return true;
	}
	return false;
	}
	
	//Este método elimina una arista entre dos vertices, al igual que en el anterior, v1 es el que apunta a v2
	public void eliminaArista(int v1, int v2) {
	if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
	throw new ArrayIndexOutOfBoundsException(
	"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
	} else if (matrix[v1][v2] == 0) {
	System.err.println("La arista NO existe");
	} else {
	matrix[v1][v2] = 0;
	}
	}
	//Este método eliminará un grafo creado anteriormente
	public void borrarGrafo() {
	for (int i = 0; i < matrix.length; i++) {
	for (int j = 0; j < matrix[i].length; j++) {
	matrix[i][j] = 0;
	}
	}
	}
	//Este método imprime la matriz resultante de un grafo
	public void impMatrix() {
	System.out.print("     ");
	for (int i = 0; i < MAXIMO_VERTICES; i++) {
	System.out.printf("  %d ", i);
	}
	System.out.println();
	System.out.println();
	for (int i = 0; i < MAXIMO_VERTICES; i++) {
	System.out.printf(" %3d", i);
	for (int j = 0; j < MAXIMO_VERTICES; j++) {
	System.out.printf(" %3d", matrix[i][j]);
	}
	System.out.println();
	}
	}
	
	// ----- Operaciones para obtener Lista de Adyacencia ----- //
	
	public boolean grafoVerticesAdyacentes(int v) {
	int auxiliar = 0;
	boolean estavacia = true;
	
	while (auxiliar < MAXIMO_VERTICES && estavacia) {
	if (matrix[v][auxiliar] == 1) {
	estavacia = false;
	} else {
	auxiliar = auxiliar + 1;
	}
	}
	
	return estavacia;
	}
	
	public int primeroListaAdy(int v) throws RuntimeException {
	int auxiliar = 0;
	boolean estavacia = true;
	
	while (auxiliar < MAXIMO_VERTICES && estavacia) {
	if (matrix[v][auxiliar] == 1) {
	estavacia = false;
	} else {
	auxiliar = auxiliar + 1;
	}
	}
	
	if (auxiliar == MAXIMO_VERTICES)
	throw new RuntimeException("La lista de Adyacencia esta vacía");
	return auxiliar;
	}
	
	public int proxAdy(int v, int ady) {
	int proximo = ady + 1;
	while (proximo < MAXIMO_VERTICES && matrix[v][proximo] == 0) {
	proximo = proximo + 1;
	}
	if (proximo == MAXIMO_VERTICES)
	return -1;
	return proximo;
	}
	
	public void main (String args[]) {
		grafos1 grafo=new grafos1(5,5);
		grafo.insertaArista(3,1,1);
		grafo.insertaArista(2,2,1);
		grafo.insertaArista(1,2,1);
		System.out.println(grafo.grafoVerticesAdyacentes(1));
		grafo.impMatrix();
		grafo.eliminaArista(1, 2);
		System.out.println();
		System.out.println("La arista 1,2 existe? "+grafo.existeArista(1,2));
		System.out.println(); System.out.println();
		grafo.impMatrix();
		grafo.borrarGrafo();
		System.out.println(); System.out.println();
		grafo.impMatrix();
	}
	
	}
