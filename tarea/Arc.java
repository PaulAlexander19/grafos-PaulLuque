// sera para enlazar a otros vertices
public class Arc<E> {
    private Vertex<E> refVertice;
    private double peso; // posicion del nodo siguiente

    public Arc(Vertex<E> destino) {
        refVertice = destino;
    }

    public Arc(Vertex<E> destino, double weight) {
        refVertice = destino;
        peso = weight;
    }

    public Vertex<E> getDestino() {
        return refVertice;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public boolean equals(Object obj) {
        Arc other = (Arc) obj;
        return (this.refVertice.equals(other.refVertice) && this.peso == other.peso);
    }

    @Override
    public String toString() {
        return refVertice.getData().toString();
    }

}
