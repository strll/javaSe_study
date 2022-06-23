package HuffmanTree;

public class HuffmanTree_Node implements Comparable<HuffmanTree_Node> {
        private int value;
        private HuffmanTree_Node left;
        private HuffmanTree_Node right;
    //排序
    @Override
    public int compareTo(HuffmanTree_Node HuffmanTree_Node) {
        return this.value-HuffmanTree_Node.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public HuffmanTree_Node getLeft() {
        return left;
    }

    public void setLeft(HuffmanTree_Node left) {
        this.left = left;
    }

    public HuffmanTree_Node getRight() {
        return right;
    }

    public void setRight(HuffmanTree_Node right) {
        this.right = right;
    }

    public HuffmanTree_Node(int value) {
        this.value = value;
    }

    //前序遍历
     public void preOrder(){
         System.out.println(this.toString());
        if (this.left!=null){
            this.left.preOrder();
        }
        if (this.right!=null){
            this.right.preOrder();
        }
     }

    @Override
    public String toString() {
        return "HuffmanTree_Node{" +
                "value=" + value +
                '}';
    }

}
