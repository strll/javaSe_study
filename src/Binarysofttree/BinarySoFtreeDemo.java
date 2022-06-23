package Binarysofttree;

public class BinarySoFtreeDemo {
    public static void main(String[] args) {
        BinaryNode binaryNode = new BinaryNode(7);
        binaryNode.add(3);
        binaryNode.add(10);
        binaryNode.add(12);
        binaryNode.add(5);
        binaryNode.add(1);
        binaryNode.add(9);
        binaryNode.add(2);
        binaryNode.infixOrder();
        binaryNode.deleteNode(2);
        System.out.println("=============");
        binaryNode.infixOrder();
    }
}
