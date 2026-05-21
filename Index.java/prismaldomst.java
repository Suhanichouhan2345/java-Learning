public class prismaldomst {
    static final int INF = 99999;

    public static void main(String[] args) {
        int[][] Graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };
        int n = Graph.length;
        boolean[] selected = new boolean[n];
        int totalCost = 0;

        selected[0] = true;
        int no_edge = 0;

        System.out.println("Edges in the MST:");
        while (no_edge < n - 1) {
            int min = INF;
            int x = 0, y = 0;

            for (int i = 0; i < n; i++) {
                if (selected[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!selected[j] && Graph[i][j]!= 0) {
                            if (min > Graph[i][j]) {
                                min = Graph[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " : " + Graph[x][y]);
            totalCost += Graph[x][y];
            selected[y] = true;
            no_edge++;
        }

        System.out.println("Total cost  " + totalCost);
    }
}