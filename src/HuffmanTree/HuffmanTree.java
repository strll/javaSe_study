package HuffmanTree;

import java.util.ArrayList;
import java.util.Collections;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] a={13,7,8,29,6,1,3};
    HuffmanTree_Node huffmanTree = createHuffmanTree(a);
    huffmanTree.preOrder();
    }

    public static HuffmanTree_Node createHuffmanTree(int[] arr){
        ArrayList<HuffmanTree_Node> HuffmanTree_NodeArrayList = new ArrayList<HuffmanTree_Node>();
        for (int i : arr) {
            HuffmanTree_NodeArrayList.add(new HuffmanTree_Node(i));
        }
        while(HuffmanTree_NodeArrayList.size() >1){
            Collections.sort(HuffmanTree_NodeArrayList);
           HuffmanTree_Node HuffmanTree_Node_one = HuffmanTree_NodeArrayList.get(0);
           HuffmanTree_Node HuffmanTree_Node_two = HuffmanTree_NodeArrayList.get(1);
           HuffmanTree_Node big_HuffmanTree_Node = new HuffmanTree_Node(HuffmanTree_Node_two.getValue() + HuffmanTree_Node_one.getValue());
           big_HuffmanTree_Node.setLeft(HuffmanTree_Node_one);
           big_HuffmanTree_Node.setRight(HuffmanTree_Node_two);
           HuffmanTree_NodeArrayList.remove(HuffmanTree_Node_one);
           HuffmanTree_NodeArrayList.remove(HuffmanTree_Node_two);
           HuffmanTree_NodeArrayList.add(big_HuffmanTree_Node);
        }

        return HuffmanTree_NodeArrayList.get(0);
    }

}
