package TreeApp;
import java.util.LinkedList;
import java.util.Queue;

 public class BinaryTree {

    Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.printf("[%d]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.printf("[%d]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%d]", node.data);
    }

    // Nomor 5 - hitung jumlah node
    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Nomor 6 - hitung jumlah daun
    public int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    // Nomor 7 - hitung tinggi tree
    public int height(Node node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Nomor 9 - level order traversal
    public void levelTraverse(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.printf("[%d]", current.data);
            
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Nomor 2 - input data acak
        for (int i = 0; i < 10; i++) {
            int nilai = (int) (Math.random() * 100);
            System.out.printf("Nilai %d dimasukkan.\n", nilai);
            tree.add(nilai);
        }

        // Nomor 4 - traversal
        System.out.print("\nPreorder  : ");
        tree.preTraverse(tree.root);

        System.out.print("\nInorder   : ");
        tree.inTraverse(tree.root);

        System.out.print("\nPostorder : ");
        tree.postTraverse(tree.root);

        //tambahan untuk menjalankan soal no.9
        System.out.print("\nLevel Order : ");

        tree.levelTraverse(tree.root);
        
        // Nomor 5 - jumlah node
        System.out.println("\n\nJumlah node : " + tree.countNodes(tree.root));

        // Nomor 6 - jumlah daun
        System.out.println("Jumlah daun : " + tree.countLeaves(tree.root));

        // Nomor 7 - tinggi tree
        System.out.println("Tinggi tree : " + tree.height(tree.root));

    }
}