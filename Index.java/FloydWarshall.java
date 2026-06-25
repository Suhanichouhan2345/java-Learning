public class FloydWarshall {
    static final int INF = 1000000000; // Infinity

    public static void floydWarshall(int[][] dist) {
        int V = dist.length;

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(
                            dist[i][j],
                            dist[i][k] + dist[k][j]
                        );
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0,   3,   INF, 7},
            {8,   0,   2,   INF},
            {5,   INF, 0,   1},
            {2,   INF, INF, 0}
        };

        floydWarshall(graph);

        System.out.println("Shortest distances between all pairs:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Negative cycle detection
        for (int i = 0; i < graph.length; i++) {
            if (graph[i][i] < 0) {
                System.out.println("Negative cycle detected!");
                break;
            }
        }
    }
}