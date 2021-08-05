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

    


}
