import java.util.*;

class TreeNodess {
    int val;
    TreeNodess left, right;
    TreeNodess(int x) {
        val = x;
    }
}
public class BinaryTreeOperations {
    // Build tree using level-order input
    public static TreeNodess buildTreeLevelOrder(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;
        TreeNodess root = new TreeNodess(val);
        Queue<TreeNodess> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNodess node = q.poll();
            if (!sc.hasNextInt()) break;
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                node.left = new TreeNodess(leftVal);
                q.offer(node.left);
            }
            if (!sc.hasNextInt()) break;
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                node.right = new TreeNodess(rightVal);
                q.offer(node.right);
            }
        }
        return root;
    }
    public static void levelOrder(TreeNodess root) {
        if (root == null) return;
        Queue<TreeNodess> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNodess node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        System.out.println();
    }
    public static int findHeight(TreeNodess root) {
        if (root == null) return 0;
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter level-order input (-1 for null):");
        TreeNodess root = buildTreeLevelOrder(sc);
        System.out.println("Level Order Traversal:");
        levelOrder(root);
        System.out.println("Height of Tree: " + findHeight(root));
    }
}