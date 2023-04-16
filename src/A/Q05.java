package A;
import java.util.*;

public class Q05 {

    static class Graph {
        int V;
        LinkedList<Integer>[] adj;
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList<>();
        }
        void addEdge(int v, int w) {
            adj[v].add(w);
        }
        void BFS(int s) {
            boolean[] visited = new boolean[V];
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            visited[s] = true;
            queue.add(s);

            while (!queue.isEmpty()) {
                s = queue.poll();
                System.out.print(s + " ");
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    // main method to test the BFS traversal
    public static void main(String[] args) {
        Graph g = new Graph(4);

        // add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2):");
        g.BFS(2);
    }
}
