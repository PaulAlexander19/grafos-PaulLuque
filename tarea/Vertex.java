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

    @Override
    public boolean equals(Object obj) {
        Vertex other = (Vertex) obj;
        return (this.name.equals(other.name));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumVertex() {
        return this.numVertex;
    }

    public void setNumVertex(int numVertex) {
        this.numVertex = numVertex;
    }

    public ArrayList<Arc> getLinks() {
        return this.links;
    }

    public void setLinks(ArrayList<Arc> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Arc: (" + this.name + ")";
    }

}