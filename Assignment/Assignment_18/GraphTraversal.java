import java.util.*;
public class GraphTraversal {
    public static List<Integer> bfsTraversal(int V, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return bfs;
    }
    public static List<Integer> dfsTraversal(int V, List<List<Integer>> adj) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsHelper(0, adj, visited, dfs);
        return dfs;
    }
    private static void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, dfs);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1, 2));
        adj.add(Arrays.asList(0, 2, 3));
        adj.add(Arrays.asList(0, 1, 4));
        adj.add(Arrays.asList(1, 4));
        adj.add(Arrays.asList(2, 3));
        List<Integer> bfs = GraphTraversal.bfsTraversal(V, adj);
        System.out.println("BFS Traversal: " + bfs);
        List<Integer> dfs = GraphTraversal.dfsTraversal(V, adj);
        System.out.println("DFS Traversal: " + dfs);
    }
}
