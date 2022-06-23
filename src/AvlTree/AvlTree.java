package AvlTree;



public class AvlTree {
    public static void main(String[] args) {
      BinaryNode binaryNode = new BinaryNode(10);
        binaryNode.add(11);
        binaryNode.add(7);
        binaryNode.add(6);
        binaryNode.add(8);
        binaryNode.add(9);
        System.out.println(binaryNode.height());
        System.out.println("左子树"+binaryNode.leftHight());
        System.out.println("右子树"+binaryNode.rightHight());
        System.out.println("根节点"+binaryNode.getValue());
        System.out.println("输出");
        binaryNode.infixOrder();
    }
}
