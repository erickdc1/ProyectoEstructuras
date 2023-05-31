


public class GrafoMatriz {
	Vertice vertice[] = new Vertice[20];
	static int MaxVerts = 20;
	static Vertice[] verts;
	int [][] matAd;
	int numeroV;
	

	
	public GrafoMatriz() {
		this(MaxVerts);
	}
	
	public GrafoMatriz(int mx) {
		matAd =new int[mx][mx];
		verts =new Vertice[mx];
		for(int i=0;i<mx;i++) {
			for(int j=0;j<mx;j++) {
				matAd[i][j]=0;	
			}
		}
	}
	
	public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numeroV) && !encontrado;) {
            encontrado = verts[i].equals(v);
            if (!encontrado) {
                i++;
            }
        }
        return (i < numeroV) ? i : -1;
    }
	
	public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(numeroV);
            verts[numeroV++] = v;
        }
    }
	
	public void nuevoArco(String a, String b) throws Exception {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
    }
	
	public boolean adyacente(String a, String b) throws Exception {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb] == 1;
    }
	
	public boolean adyacente(int va, int vb) throws Exception {
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb] == 1;
    }
	
	public void puntosArticulacion(GrafoMatriz g, int v, int[] num, int paso, boolean[] visitado, int[] arista, int[] bajo) throws Exception {
        visitado[v] = true;
        num[v] = ++paso;
        bajo[v] = num[v]; // valor inicial para cálculo de bajo()

        for (int w = 0; w < g.numeroV; w++) {
            if (g.adyacente(v, w)) { // adyacente w
                if (!visitado[w]) {
                    arista[w] = v;
                    puntosArticulacion(g, w, num, paso, visitado, arista, bajo);
                    if (bajo[w] >= num[v]) {
                        System.out.println("Vértice " + v + " es punto de articulación");
                    }
                    bajo[v] = Math.min(bajo[v], bajo[w]);
                } else if (arista[v] != w) {
                    bajo[v] = Math.min(bajo[v], num[w]);
                }
            }
        }
        }
		
	

	
}
