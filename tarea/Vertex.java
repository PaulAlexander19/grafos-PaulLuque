import java.util.ArrayList;

// clase de los vertices 

public class Vertex<E> {
    E data; // Sera lo que lo representa, puede ser cualquier cosa
    ArrayList<Arc<E>> links; // enlaces del vertice
    boolean visited;

    public Vertex(E data) {
        this.data = data;
        links = new ArrayList<Arc<E>>();
        visited = false;
    }

    @Override
    public boolean equals(Object obj) {
        Vertex<E> other = (Vertex<E>) obj;
        return (this.data.equals(other.data) && (links.equals(other.links)));
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public ArrayList<Arc<E>> getLinks() {
        return this.links;
    }

    public void setLinks(ArrayList<Arc<E>> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "(" + this.data + ")";
    }

    public void unvisited(){
        this.visited = false;
    }

}