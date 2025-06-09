import java.util.*;
class TreeNode {
    int val;
    TreeNodes left, right;
    TreeNode(int x) {
        val = x;
    }
}
public class LevelOrderTraversal {
    public static TreeNodes buildTreeLevelOrder(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;
        TreeNodes root = new TreeNodes(val);
        Queue<TreeNodes> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNodes node = q.poll();
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                node.left = new TreeNodes(leftVal);
                q.offer(node.left);
            }
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                node.right = new TreeNodes(rightVal);
                q.offer(node.right);
            }
        }
        return root;
    }
    public static void levelOrder(TreeNodes root) {
        if (root == null) return;
        Queue<TreeNodes> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNodes node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree nodes in level order (use -1 for null):");
        TreeNodes root = buildTreeLevelOrder(sc);
        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
