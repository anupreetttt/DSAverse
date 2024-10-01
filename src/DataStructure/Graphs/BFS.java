package DataStructure.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[][] graph = new boolean[n][n];

        for(boolean[] row: graph) {
            Arrays.fill(row, false);
        }
        for(int[] edge: edges) {
            int u = edge[0], v = edge[1];
            graph[u][v] = true;
            graph[v][u] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            visited[i] = false;
        }
        visited[source] = true;
        while(!q.isEmpty()) {

            int current = q.remove();

            if(current == destination) return true;

            for(int i = 0; i < n; i++) {
                if(graph[current][i] == true && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 3;
        int[][]edge = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        System.out.println(validPath(n, edge, source, destination));
    }
}
