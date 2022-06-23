package Tree;

import jdk.nashorn.internal.ir.BinaryNode;
import org.junit.Test;

public class Tree_test {
    @Test
    public void easy_tree(){
        HeroNode heroNode_sanguo = new HeroNode("三国",0);
        HeroNode heroNode_shu_1 = new HeroNode("刘备",1.1);
        HeroNode heroNode_shu_2 = new HeroNode("张飞",1.2);
        HeroNode heroNode_shu_3 = new HeroNode("关羽",1.3);
        HeroNode heroNode_wei_1 = new HeroNode("曹操",2.1);
        HeroNode heroNode_wei_2 = new HeroNode("曹丕",2.2);
        HeroNode heroNode_wei_3 = new HeroNode("曹真",2.3);
        heroNode_shu_1.setLeft(heroNode_shu_2);
        heroNode_shu_1.setRight(heroNode_shu_3);
        heroNode_wei_1.setLeft(heroNode_wei_2);
        heroNode_wei_1.setRight(heroNode_wei_3);
        heroNode_sanguo.setRight(heroNode_wei_1);
        heroNode_sanguo.setLeft( heroNode_shu_1);
        BinaryTree binaryNode = new BinaryTree();
        binaryNode.setHeroNode(heroNode_sanguo);

        binaryNode.postOrder();
        System.out.println("------------");

    }
    @Test
    public void tree_Set_test(){
        HeroNode heroNode_sanguo = new HeroNode("三国",1.5);
        HeroNode heroNode_shu_1 = new HeroNode("刘备",1.1);
        HeroNode heroNode_shu_2 = new HeroNode("张飞",1.2);
        HeroNode heroNode_shu_3 = new HeroNode("关羽",1.3);
        HeroNode heroNode_wei_1 = new HeroNode("曹操",2.1);
        HeroNode heroNode_wei_2 = new HeroNode("曹丕",2.2);
        HeroNode heroNode_wei_3 = new HeroNode("曹真",2.3);
        BinaryTree binaryNode = new BinaryTree();
        binaryNode.setHeroNode(heroNode_sanguo);
        binaryNode.my_Set_New_Node(heroNode_shu_1);
        binaryNode.my_Set_New_Node(heroNode_shu_2);
        binaryNode.my_Set_New_Node(heroNode_shu_3);
        binaryNode.my_Set_New_Node(heroNode_wei_1);
        binaryNode.my_Set_New_Node(heroNode_wei_2);
        binaryNode.my_Set_New_Node(heroNode_wei_3);
        binaryNode.infixOrder();
        Double id = binaryNode.find_id_by_name("曹真");
        System.out.println("id is"+id);


    }


}
