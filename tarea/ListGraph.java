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
    public void newVertex(String name) {
        boolean existe = positionVertex(name) >= 0;
        if (!existe) {
            Vertex v = new Vertex(name);
            v.asigPosition(numVertes);
            arrVertes[numVertes++] = v;
        }
    }

}
