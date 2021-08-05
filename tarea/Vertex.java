import java.util.ArrayList;

// clase de los vertices 

public class Vertex {
    String name; // Sera lo que lo representa, puede ser cualquier cosa
    int numVertex; // para la posicion en el arreglo
    ArrayList<Arc> links; // enlaces del vertice

    public Vertex(String name) {
        this.name = name;
        links = new ArrayList<Arc>();
    }

    public Vertex(String name, int numVertex) {
        this.name = name;
        this.numVertex = numVertex;
        links = new ArrayList<Arc>();
    }

    

}