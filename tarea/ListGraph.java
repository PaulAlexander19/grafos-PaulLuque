import java.util.ArrayList;

public class ListGraph<E> {
    private int numVertes; // el numero de verices actuales
    ArrayList<Vertex<E>> arrVertes; // el arreglo de los vertices

    public ListGraph() {
        this.numVertes = 0;
        arrVertes = new ArrayList<Vertex<E>>();
    }

    // regesa la lista de adyacentes de nodo en la posicion v
    public ArrayList<Arc<E>> getLinks(E a) throws Exception {
        Vertex<E> v = getVertex(a);
        if (!arrVertes.contains(v)) {
            throw new Exception("Vértice no existe");
        }
        int pos = arrVertes.indexOf(v);
        return arrVertes.get(pos).getLinks();
    }

    // Busca y devuelve la posicion del vértice, si no lo encuentra regresa -1
    private Vertex<E> getVertex(E name) {

        for (Vertex<E> vertex : arrVertes) {
            if (vertex.getData().equals(name)) {
                return vertex;
            }
        }

        return null;
    }

    // Crea un nuevo vértice
    public void newVertex(E name) throws Exception {

        Vertex<E> existe = getVertex(name);

        if (existe == null) {
            Vertex<E> v = new Vertex<E>(name);
            arrVertes.add(v);
        } else {
            throw new Exception("El Vertice existe");
        }
    }

    // Comprueba si dos vertices son adyacentes
    public boolean isAdyacente(E a, E b) throws Exception {
        Vertex<E> v1 = getVertex(a);
        Vertex<E> v2 = getVertex(b);
        if (v1 == null || v2 == null) {
            throw new Exception("El vértice no existe");
        }

        for (Arc<E> arc : v1.getLinks()) {
            if (arc.getDestino().equals(v2)) {
                return true;
            }
        }

        return false;
    }

    // Crea un nuevo arco
    public void newArco(E a, E b) throws Exception {
        Vertex<E> v1 = getVertex(a);
        Vertex<E> v2 = getVertex(b);

        if (v1 == null || v2 == null) {
            throw new Exception("El vértice no existe");
        }

        if (isAdyacente(a, b)) {
            throw new Exception("Ya existe el enlace");
        }
        Arc<E> enlace = new Arc<E>(v2);
        v1.getLinks().add(enlace);

        // // no dirigido
        // Arc<E> enlace2 = new Arc<E>(v1);
        // v1.getLinks().add(enlace2);

    }

    public void nuevoArco(E a, E b, double peso) throws Exception {
        Vertex<E> v1 = getVertex(a);
        Vertex<E> v2 = getVertex(b);

        if (v1 == null || v2 == null) {
            throw new Exception("El vértice no existe");
        }

        if (isAdyacente(a, b)) {
            throw new Exception("Ya existe el enlace");
        }
        Arc<E> enlace = new Arc<E>(v2, peso);
        v1.getLinks().add(enlace);

        // // no dirigido
        // Arc<E> enlace2 = new Arc<E>(v1, peso);
        // v1.getLinks().add(enlace2);

    }

    // borra un arco ya creado
    public void borrarEnlace(E a, E b) throws Exception {
        Vertex<E> v1 = getVertex(a);
        Vertex<E> v2 = getVertex(b);
        Arc<E> temEnlace = getEnlace(a, b);

        if (v1.getLinks().contains(temEnlace)) {
            v1.getLinks().remove(temEnlace);
        } else {
            throw new Exception("Enlace no existe");
        }

    }

    private Arc<E> getEnlace(E a, E b) throws Exception {
        Vertex<E> v1 = getVertex(a);
        Vertex<E> v2 = getVertex(b);
        if (v1 == null || v2 == null) {
            throw new Exception("El vértice no existe");
        }
        for (Arc<E> enlace : getVertex(a).getLinks()) {
            if (enlace.getDestino().equals(v2)) {
                return enlace;
            }
        }
        return null;
    }

}
