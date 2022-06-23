package Binarysofttree;

public class BinaryNode {
    private BinaryNode left;
    private BinaryNode right;
    private int value;

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode(int value) {
        this.value = value;
    }
    public void add(int value){
        BinaryNode node=new BinaryNode(value);
        if (node==null){
            return;
        }
        if (node.value<this.value){
            if(this.left == null){
                this.left=node;
            }else{
                this.left.add(node.value);
            }
        }else{
            if(this.right==null){
                this.right=node;
            }else{
                this.right.add(node.value);
            }
        }
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                '}';
    }
    public  void deleteNode(int value){
        BinaryNode delete_Node = this.search(value);
        BinaryNode parent_Node = this.searchParent(value);
        int flag;
        if (delete_Node.getValue()>=parent_Node.getValue()){
            flag=1; //删除节点是右节点
        }else{
            flag=0;//左节点
        }
        //是叶子节点
        if (delete_Node.getLeft()==null&&delete_Node.getRight()==null){
           if (flag==0){
               parent_Node.setLeft(null);
           }else{
               parent_Node.setRight(null);
           }
        }
        //被删除的下面还有一个节点
        //有一个右节点
        if (delete_Node.getLeft()==null&&delete_Node.getRight()!=null){
            if(flag==0){//删除的是父节点的左节点
                parent_Node.setLeft(delete_Node.getRight());
            }else{
                parent_Node.setRight(delete_Node.getRight());
                }
        }
        //被删除的节点有一个左节点
        if (delete_Node.getRight()==null&&delete_Node.getLeft()!=null){
            if(flag==0){//删除的是父节点的左节点
                parent_Node.setLeft(delete_Node.getLeft());
            }else{
                parent_Node.setRight(delete_Node.getLeft());
            }
        }
        //被删除节点有左右两个子节点
        if (delete_Node.getRight()!=null&&delete_Node.getLeft()!=null) {

            int i = deleteRightTreeMin(delete_Node.getRight());
            delete_Node.setValue(i);
        }
    }
    public int deleteRightTreeMin( BinaryNode node){
        BinaryNode target=node;
        while(target.left!=null){
            target=target.left;
        }
        int re= target.getValue();
        deleteNode(target.getValue());
        return re;
    }


    //查询删除节点
    public  BinaryNode search(int value){
        if(value==this.value){
            return this;
        }else if(value<this.value){
            if(this.left==null){
                return null ;
            }
           return this.left.search(value);
        }else{
            if(this.right==null){
                return null;
            }
           return this.right.search(value);
        }
    }
//查找删除的父节点 找不到就返回null
    public BinaryNode searchParent(int value){
        if ((this.left!=null && value==this.left.value)||(this.right!=null&&this.right.value==value)){
            return this;
        }
        else{
            if(value<this.value&&this.left!=null){
                return this.left.searchParent(value);
            }else if(value>=this.value&&this.right!=null){
                return this.right.searchParent(value);
            }else {
                return null;
            }
        }
    }
    //中序遍历
    public void infixOrder(){

        if(this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this.toString());
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
}
