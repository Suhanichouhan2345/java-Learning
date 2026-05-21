import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class KruskalMST {

    static int[] parent;

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px != py) {
            parent[px] = py;
        }
    }

    static void kruskal(int V, ArrayList<Edge> edges) {

        Collections.sort(edges);
        parent = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        int mstCost = 0;

        System.out.println("Edges in MST:");

        for (Edge e : edges) {

            if (find(e.src) != find(e.dest)) {

                union(e.src, e.dest);

                mstCost += e.weight;

                System.out.println(
                    e.src + " - " + e.dest + " : " + e.weight
                );
            }
        }

        System.out.println("Total MST Cost = " + mstCost);
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        kruskal(V, edges);
    }
}