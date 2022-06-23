package my_Arraylist;

public class This_is_my_Linklist<T> {
    private class Node {
        private T data;
        private Node next;

        public Node() {
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //创建空链表
    public This_is_my_Linklist() {
        head = null;
        tail = null;
    }

    //创建一个链表
    public This_is_my_Linklist(T element) {
        Node node = new Node(element, null);
        head = node;
        tail = node;
        size++;
    }

    //向链表里面添加一个元素
    public void add(T element) {
        Node node = new Node(element, null);
        tail.next = node;
        tail = node;
        size++;
    }

    public T pop() {
        if (size < 0) {
            throw new IndexOutOfBoundsException("pop越界了");
        }
        Node node = head;
        for (int i = 0; i < size && node != null; i++, node = node.next) {

            if (i == size-2 ){
                T data = node.next.getData();
                node.next =null ;
                size--;
                return data;
            }
        }
        return null;
    }

   private Node get_by_num(int num) {
            num=num-1;
        if (num < 0 || num >= size) {
            throw new IndexOutOfBoundsException("get_by_num越界了");
        }
        Node node = head;
        for (int i = 0; i < size && node != null; i++, node = node.next) {

            if (i == num ){
                return node;
            }
        }
        return null;
    }



    public void delete_by_num(int num){
        System.out.println("size 是"+size);
        if (num <= 0 || num > size) {
            throw new IndexOutOfBoundsException("get_by_num越界了");
        }
        Node node = head;
        if (num==1&&size>1){
            head= head.next;
            size--;
        }else if (num ==1&&size==1){
            head=null;
            tail=null;
            size--;
        }else{
            for (int i = 0; i <= size && node != null; i++) {

                if (i == num-2) {
                    Node no1= node.next;
                    node.next=node.next.next;
                    no1.next=null;
                    size--;
                }
                node = node.next;
            }
        }
    }
    public void show(){
       Node node= head;
        for (int i = 0;i<size&&node!=null;i++){
            T data = node.getData();
            System.out.println(data.toString());
            node=node.next;
        }

    }


    public void head_insert(T element){
        if(head==null){
            Node node = new Node(element, null);
            head=node;
            size++;
        }else{
            Node node= head;
            head= new Node(element, node);
            size++;
        }

    }
            //插入再第num个的后面  要是插入头部的话num=0
    public void insert_by_num(int num ,T element ){
     //   num=num-1;
        if(num==0){
            head_insert(element);
        }else{
            Node by_num = get_by_num(num);
            Node node = new Node(element, by_num.next);
            by_num.next=node;
            size++;
        }
    }

    public int get_size_by_data(T element){
        Node node= head;
        for (int i=0;i<size;i++)
        {
            if ( node.data.equals(element)){
                return i+1;
            }
            node=node.next;

        }

        return -1;
    }


}



