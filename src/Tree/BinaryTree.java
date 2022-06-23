package Tree;

public class BinaryTree {
    private HeroNode heroNode;

    public void setHeroNode(HeroNode heroNode) {
        this.heroNode = heroNode;
    }

    //前序遍历
    public void preOrder(){
      if (heroNode==null){
          System.out.println("树为空不能遍历");
      }else{
          this.heroNode.preOrder();
      }
    }
    //中序遍历
    public void infixOrder(){
        if (heroNode==null){
            System.out.println("树为空不能遍历");
        }else{
            this.heroNode.infixOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if (heroNode==null){
            System.out.println("树为空不能遍历");
        }else{
            this.heroNode.postOrder();
        }
    }

    public Double find_id_by_name(String name){

        if (heroNode==null){
            System.out.println("树为空不能遍历");
        }else{
          return  this.heroNode.get_id_by_key(name,heroNode);
        }
        return -1.00;
    }


    public void my_Set_New_Node(HeroNode new_hero_Node) {
        set_New_Node_method(new_hero_Node,heroNode);
    }

    
    private void set_New_Node_method(HeroNode new_hero_Node,HeroNode hero_Node){
        double new_id = new_hero_Node.getId();
        double id = hero_Node.getId();

        if (new_id<id){
            if(hero_Node.getLeft()==null) {
                hero_Node.setLeft(new_hero_Node);
            }else{
                set_New_Node_method( new_hero_Node,hero_Node.getLeft());
            }

        }else{
            if(hero_Node.getRight()==null) {
                hero_Node.setRight(new_hero_Node);
            }else{
                set_New_Node_method( new_hero_Node,hero_Node.getRight());
            }

        }


    }


}
