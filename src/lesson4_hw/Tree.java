package lesson4_hw;

public class Tree {


    class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public Node root;
    public void add(int value) {
        root = appendNode(root, value);
    }
    private Node appendNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (current.value > value) {
            current.left = appendNode(current.left, value);
        } else if (current.value < value) {
            current.right = appendNode(current.right, value);
        }
        return current;
    }
    public Tree(){
        root = null;
    }

    // 1. Реализовать поиск максимального элемента в дереве.
    // Метод назвать findLast
    public int findLast(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            int leftMax, rightMax;
            int max = node.value;

            if (node.right != null) {
                rightMax = findLast(node.right);
                max = Math.max(max, rightMax);
            }
            if(node.left != null){
                leftMax = findLast(node.left);
                max = Math.max(max, leftMax);
            }
            return max;
        }
    }
    // 2. Реализовать подсчет листьев.
    // Листья - это такие узлы дерева, у которых нет дочерних элементов.
    // Метод назвать getChildrenCount

    public int getChildrenCount(Node node){
        if (node == null)
            return 0;
        if (node.left == null && node.right == null){
            return 1;
        }
        else{
            return getChildrenCount(node.left) + getChildrenCount(node.right);
        }
    }
}
