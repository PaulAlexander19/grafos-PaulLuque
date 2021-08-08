public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola grafos");
        ListGraph<String> g = new ListGraph<String>();
        g.newVertex("Arequipa");
        g.newVertex("Puno");
        g.newVertex("Lima");

        g.newArco("Arequipa", "Puno");

        System.out.println(g.isAdyacente("Arequipa", "Puno"));
        System.out.println(g.isAdyacente("Puno", "Arequipa"));
        System.out.println(g.isAdyacente("Arequipa", "Lima"));
        System.out.println(g.isAdyacente("Puno", "Lima"));
        
    }
}
