public class Kruskalotimize {

   
    static class Edge {
        int u, v, weight;
        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    static class EdgeList {
        Edge[] data;
        int n; 
        EdgeList(int size) {
            data = new Edge[size];
            n = 0;
        }
    }

 
    static int find(int belongs[], int vertexNo) {
        return belongs[vertexNo];
    }

    static void applyUnion(int belongs[], int c1, int c2, int n) {
        for (int i = 0; i < n; i++) {
            if (belongs[i] == c2) {
                belongs[i] = c1; 
            }
        }
    }

    
    public static void main(String[] args) {
        int n = 4;
        int e = 5; 
        EdgeList elist = new EdgeList(e);
        elist.data[0] = new Edge(0, 1, 10);
        elist.data[1] = new Edge(0, 2, 6);
        elist.data[2] = new Edge(0, 3, 5);
        elist.data[3] = new Edge(1, 3, 15);
        elist.data[4] = new Edge(2, 3, 4);
        elist.n = e;

        int[] belongs = new int[n];
        for (int i = 0; i < n; i++) {
            belongs[i] = i;
        }

     
        EdgeList spanlist = new EdgeList(n - 1);

        for (int i = 0; i < elist.n; i++) {
            int cno1 = find(belongs, elist.data[i].u);
            int cno2 = find(belongs, elist.data[i].v);
            if (cno1!= cno2) {
                spanlist.data[spanlist.n] = elist.data[i];
                spanlist.n = spanlist.n + 1;
                applyUnion(belongs, cno1, cno2, n);
            }
        }

        System.out.println("Minimum Spanning Tree edges:");
        for (int i = 0; i < spanlist.n; i++) {
            System.out.println(spanlist.data[i].u + " - " +
                             spanlist.data[i].v + " : " +
                             spanlist.data[i].weight);
        }
    }
}