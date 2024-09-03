import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    int value;
    List<TreeNode> children;

    public TreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }
}

public class TreeExample {
    public static void main(String[] args) {
        // Build a tree based on user input
        TreeNode root = buildTree();

        // Find and print leaf nodes
        List<TreeNode> leafNodes = findLeafNodes(root);
        System.out.println("Leaf Nodes:");
        for (TreeNode leaf : leafNodes) {
            System.out.println(leaf.value);
        }
    }

    // Method to build a tree based on user input
    private static TreeNode buildTree() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for the root node:");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);

        buildSubtree(root, scanner);

        scanner.close();
        return root;
    }

    // Recursive method to build a subtree based on user input
    private static void buildSubtree(TreeNode parent, Scanner scanner) {
        System.out.println("Enter the number of children for node " + parent.value + ":");
        int numChildren = scanner.nextInt();

        for (int i = 0; i < numChildren; i++) {
            System.out.println("Enter the value for child " + (i + 1) + " of node " + parent.value + ":");
            int childValue = scanner.nextInt();
            TreeNode child = new TreeNode(childValue);
            parent.addChild(child);

            buildSubtree(child, scanner);
        }
    }

    // Recursive method to find leaf nodes of the tree
    private static List<TreeNode> findLeafNodes(TreeNode node) {
        List<TreeNode> leafNodes = new ArrayList<>();

        if (node.isLeaf()) {
            leafNodes.add(node);
        } else {
            for (TreeNode child : node.getChildren()) {
                leafNodes.addAll(findLeafNodes(child));
            }
        }

        return leafNodes;
    }
}
