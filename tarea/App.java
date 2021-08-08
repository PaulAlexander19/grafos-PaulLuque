public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola grafos");
        ListGraph<String> g = new ListGraph<String>();
        g.newVertex("0");
        g.newVertex("3");
        g.newVertex("1");
        g.newVertex("2");
        g.newVertex("4");
        g.newVertex("5");

        g.newArco("3", "0");
        g.newArco("3", "1");
        g.newArco("0", "4");
        g.newArco("5", "1");
        g.newArco("4", "2");
        g.newArco("4", "5");

        // System.out.println(g.isAdyacente("Arequipa", "Puno"));
        // System.out.println(g.isAdyacente("Puno", "Arequipa"));
        // System.out.println(g.isAdyacente("Arequipa", "Lima"));
        // System.out.println(g.isAdyacente("Puno", "Lima"));
        
        System.out.println(g);
        g.bfs("2");
        // g.borrarEnlace("4", "2");
        // System.out.println(g);

        // g.bfs("Arequipa");
    }
}
