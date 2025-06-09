import java.util.*;
class TreeNodes {
    int val;
    TreeNodes left, right;
    TreeNodes(int x) {
        val = x;
    }
}
public class LeafNodeCounter {
    public static TreeNodes buildTreeLevelOrder(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;
        TreeNodes root = new TreeNodes(val);
        Queue<TreeNodes> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNodes node = q.poll();
            if (!sc.hasNextInt()) break;
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                node.left = new TreeNodes(leftVal);
                q.offer(node.left);
            }
            if (!sc.hasNextInt()) break;
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                node.right = new TreeNodes(rightVal);
                q.offer(node.right);
            }
        }
        return root;
    }
    public static int countLeafNodes(TreeNodes root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree nodes in level order (use -1 for nulls):");
        TreeNodes root = buildTreeLevelOrder(sc);
        int leafCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes: " + leafCount);
    }
}