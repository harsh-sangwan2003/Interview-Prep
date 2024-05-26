import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    private class Edge {

        int vertex;
        int wt;

        Edge(int vertex, int wt) {
            this.vertex = vertex;
            this.wt = wt;
        }
    }

    private class Pair {

        int vertex;
        int dist;

        Pair(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }
    }

    public int[] solve(int A, int[][] B, int C) {

        if (B.length == 0 || B[0].length == 0)
            return new int[] { -1 };

        List<Edge>[] graph = new ArrayList[A];

        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<Edge>();

        for (int i = 0; i < B.length; i++) {

            int u = B[i][0], v = B[i][1], wt = B[i][2];
            graph[u].add(new Edge(v, wt));
            graph[v].add(new Edge(u, wt));
        }

        int[] res = new int[A];
        Arrays.fill(res, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((e1, e2) -> e1.dist - e2.dist);
        res[C] = 0;

        for (Edge edge : graph[C]) {

            Pair pair = new Pair(edge.vertex, edge.wt);
            pq.add(pair);
        }

        while (pq.size() != 0) {

            Pair pair = pq.remove();
            int v = pair.vertex;
            int d = pair.dist;

            if (res[v] < d)
                continue;

            res[v] = d;

            for (Edge neigh : graph[v]) {

                int vertex = neigh.vertex;
                int new_dist = neigh.wt + d;

                if (new_dist < res[vertex])
                    pq.add(new Pair(vertex, new_dist));
            }
        }

        for (int i = 0; i < res.length; i++) {

            if (res[i] == Integer.MAX_VALUE)
                res[i] = -1;
        }

        return res;
    }
}
