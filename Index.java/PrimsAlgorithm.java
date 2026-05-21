import java.util.*;
class Edge {
    
    int vertex;
    int weight;

    Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}
public class PrimsAlgorithm {
    static void prim(int V, ArrayList<ArrayList<Edge>> adj) {

        PriorityQueue<Edge> pq =
        new PriorityQueue<>((a, b) -> a.weight - b.weight);
        boolean[] visited = new boolean[V];
        pq.add(new Edge(0, 0));
        int totalCost = 0;

        while (!pq.isEmpty()) {

            Edge current = pq.poll();

            int u = current.vertex;
            int weight = current.weight;

            if (visited[u])
                continue;

            visited[u] = true;
            totalCost += weight;

            for (Edge neighbor : adj.get(u)) {

                if (!visited[neighbor.vertex]) {
                    pq.add(new Edge(neighbor.vertex, neighbor.weight));
                }
            }
        }

        System.out.println("Minimum Cost = " + totalCost);
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 3, 6);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 1, 3, 8);
        addEdge(adj, 1, 4, 5);
        addEdge(adj, 2, 4, 7);

        prim(V, adj);
    }

    static void addEdge(ArrayList<ArrayList<Edge>> adj,
                        int u, int v, int w) {

        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }
}