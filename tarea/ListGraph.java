import java.util.ArrayList;

public class ListGraph {
    private static final int MAX = 100000; // numero maximo de vertices
    private int numVertes; // el numero de verices actuales
    private int maxVertes; // el nuemro maximo de vertices
    Vertex[] arrVertes; // el arreglo de los vertices

    public ListGraph() {
        this(MAX);
    }

    public ListGraph(int maxVertes) {
        this.maxVertes = maxVertes;
        this.numVertes = 0;
        arrVertes = new Vertex[maxVertes];
    }

    // regesa la lista de adyacentes de nodo en la posicion v
    public ArrayList<Arc> getLinks(int v) throws Exception {
        if (v < 0 || v >= numVertes) {
            throw new Exception("Vértice fuera de rango");
        } else if (arrVertes[v] == null) {
            throw new Exception("Vértice no existe");
        }

        return arrVertes[v].getLinks();
    }

    // Busca y devuelve la posicion del vértice, si no lo encuentra regresa -1
    public int positionVertex(String name) {
        int i = -1;
        for (; (i < numVertes);) {
            i++;
            if (arrVertes[i].getName().equals(name)) {
                break;
            }
        }
        return (i < numVertes) ? i : -1;
    }

    // Crea un nuevo vértice
    public void newVertex(String name) throws Exception {
        if (numVertes >= maxVertes) {
            throw new Exception("Grafo lleno");
        }

        boolean existe = positionVertex(name) >= 0;
        if (!existe) {
            Vertex v = new Vertex(name);
            v.asigPosition(numVertes);
            arrVertes[numVertes++] = v;
        } else {
            throw new Exception("El Vertice existe");
        }
    }

    // Comprueba si dos vertices son adyacentes
    public boolean adyacente(String a, String b) throws Exception {
        int v1, v2;
        v1 = numVertice(a);
        v2 = numVertice(b);
        if (v1 < 0 || v2 < 0) {
            throw new Exception("El vértice no existe");
        }
        if (tablAdc[v1].lad.contains(new Arco(v2))) {
            return true;
        } else {
            return false;
        }
    }

    // Comprueba si dos vertices son adyacentes por el número de vértice
    private boolean adyacente(int v1, int v2) throws Exception {
        if (tablAdc[v1].lad.contains(new Arco(v2))) {
            return true;
        } else {
            return false;
        }
    }

    // Crea un nuevo arco
    public void nuevoArco(String a, String b) throws Exception {
        if (!adyacente(a, b)) {
            int v1 = numVertice(a);
            int v2 = numVertice(b);
            if (v1 < 0 || v2 < 0) {
                throw new Exception("El vértice no existe");
            }
            Arco ab = new Arco(v2);
            tablAdc[v1].lad.addFirst(ab);
        }
    }

    // borra un arco ya creado
    public void borrarArco(String a, String b) throws Exception {
        int v1 = numVertice(a);
        int v2 = numVertice(b);
        if (v1 < 0 || v2 < 0) {
            throw new Exception("El vértice no existe");
        }
        Arco ab = new Arco(v2);
        tablAdc[v1].lad.remove(ab);
    }

}
