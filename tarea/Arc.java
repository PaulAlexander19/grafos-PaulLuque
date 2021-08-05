// sera para enlazar a otros vertices
public class Arc {
    private int positionNext; // posicion del nodo siguiente
    private double weight;

    public Arc(int destino) {
        positionNext = destino;
    }

    public Arc(int destino, double weight) {
        positionNext = destino;
        this.weight = weight;
    }

    public int getDestino() {
        return positionNext;
    }

    @Override
    public boolean equals(Object obj) {
        Arc other = (Arc) obj;
        return (this.positionNext == other.positionNext && this.weight == other.weight);
    }

}
