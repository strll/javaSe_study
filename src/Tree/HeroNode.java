package Tree;

public class HeroNode {
    private String name;
    private double id;
    private HeroNode left;
    private  HeroNode right;

    public HeroNode(String name, double  id) {
        this.name = name;
        this.id = id;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double  getId() {
        return id;
    }

    public void setId(double  id) {
        this.id = id;
    }

    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if (this.left!=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }

    }
    //中序遍历
    public void infixOrder(){
        if (this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if (this.left!=null){
            this.left.postOrder();
        }

        if(this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }

    public double get_id_by_key(String name,HeroNode heroNode){

        if(heroNode.name.equals(name)){
            return heroNode.id;
        }else {

            if (heroNode.left != null) {
                double id_by_key = get_id_by_key(name, heroNode.left);
                if (id_by_key!=-1){
                    return id_by_key;
                }
            }

            if (heroNode.right != null) {

                double id_by_key = get_id_by_key(name, heroNode.right);
                if (id_by_key!=-1){
                    return id_by_key;
                }
            }

        }
        return -1;
    }

}
