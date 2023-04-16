package A;

import java.util.*;

public class Q06 {

    // Graph class to represent a graph
    static class Graph {
        int V; // number of vertices
        LinkedList<Integer>[] adj; // adjacency list

        // constructor
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList<>();
        }

        // add edge to the graph
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // Depth-first search traversal
        void DFS(int v, boolean[] visited) {
            // mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");

            // recur for all vertices adjacent to this vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFS(n, visited);
            }
        }

        // wrapper method for DFS
        void DFS(int v) {
            boolean[] visited = new boolean[V];
            DFS(v, visited);
        }
    }

    // main method to test the DFS traversal
    public static void main(String[] args) {
        Graph g = new Graph(4);

        // add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Traversal (starting from vertex 2):");
        g.DFS(2);
    }
}

