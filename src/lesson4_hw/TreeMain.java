package lesson4_hw;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(2);
        tree.add(4);
        tree.add(3);
        tree.add(1);
        tree.add(5);
        tree.add(9);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        System.out.println("Максимальный элемент в дереве: " + tree.findLast(tree.root));
        System.out.println("Количество листьев: " + tree.getChildrenCount(tree.root));
    }
}
