package DataStructure.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphs {


    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public Graphs(int node) {
        this.V = node;
        this.E = 0;

        this.adj = new LinkedList[node];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }

    }

    public void addEdge(int u, int v) {

        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public void bfs(int s) {

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.offer(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();

            System.out.println(u);

            for(int n : adj[u]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.offer(n);
                }
            }
        }
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(s);
        while(!(stack.isEmpty())) {
            int u = stack.pop();

            if(!visited[u]) {
                visited[u] = true;
                System.out.println(u);
                for (int v : adj[u]) {
                    if(!visited[v]) {
                      stack.push(v);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Graphs graph = new Graphs(6);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 5);
        graph.addEdge(5, 2);
        graph.addEdge(1,3);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(4,3);
        graph.addEdge(4,5);
        graph.addEdge(5,4);
        graph.dfs(1);

    }
}
