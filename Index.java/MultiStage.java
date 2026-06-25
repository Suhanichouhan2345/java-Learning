import java.util.*;
import java.io.*;
public class MultiStage {
    static int N = 8;
    static int INF = 99999;

    public static int shortestDist(int[][] graph) {
        int[] cost = new int[N];
        cost[N - 1] = 0;

        for (int i = N - 2; i >= 0; i--) {
            cost[i] = INF;
            for (int j = i + 1; j < N; j++) {
                
             if (graph[i][j] == INF) {
                    continue;
                }
                cost[i] = Math.min(cost[i], graph[i][j] + cost[j]);  
            }
        }
        return cost[0];
    }
    public static void main(String[] args) {
        int[][] graph = new int[][] {
            { INF, 1, 2, 5, INF, INF, INF, INF },
            { INF, INF, INF, INF, 4, 11, INF, INF },
            { INF, INF, INF, INF, 9, 5, 16, INF },
            { INF, INF, INF, INF, 2, INF },
            { INF, INF, INF, INF, INF, INF, INF, 18 },
            { INF, INF, INF, 13 },
            { INF, INF, INF, 2 },
            { INF, INF, INF, INF, INF, 0 }
        };

        System.out.println(shortestDist(graph));
    }
}