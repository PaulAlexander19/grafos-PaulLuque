import java.util.ArrayList;

// clase de los vertices 

public class Vertex<T> {
    T data; // Sera lo que lo representa, puede ser cualquier cosa
    ArrayList<Arc<T>> links; // enlaces del vertice

    public Vertex(T data) {
        this.data = data;
        links = new ArrayList<Arc<T>>();
    }

    @Override
    public boolean equals(Object obj) {
        Vertex<T> other = (Vertex<T>) obj;
        return (this.data.equals(other.data) && (links.equals(other.links)));
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<Arc<T>> getLinks() {
        return this.links;
    }

    public void setLinks(ArrayList<Arc<T>> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "(" + this.data + ")";
    }

}