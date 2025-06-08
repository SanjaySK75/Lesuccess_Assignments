import java.util.*;
public class RatMaze {
    public List<String> findPath(int[][] maze, int n) {
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1) {
            solve(0, 0, maze, n, "", visited, paths);
        }
        return paths;
    }
    private void solve(int x, int y, int[][] maze, int n, String path, boolean[][] visited, List<String> result) {
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && maze[nx][ny] == 1 && !visited[nx][ny]) {
                solve(nx, ny, maze, n, path + dir[i], visited, result);
            }
        }
        visited[x][y] = false;
    }
    public static void main(String[] args) {
        RatMaze rm = new RatMaze();
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        List<String> paths = rm.findPath(maze, 4);
        System.out.println(paths);
    }
}
