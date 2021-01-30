import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class LinkedList implements Ilist {


    class Node {
        int value;
        Node next=null;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    Node root= null;

    @Override
    public void clear() {
      if(root==null) {return;}
      else
        root=root.next;clear();
    }
    @Override
    public int size() {
            return size(root, 0);
        }

        private int size(Node node, int size) {
            if (node == null) {
                return size;
            }

            return size(root.next, size + 1);
        }

    @Override
    public int get(int index) {return get(index,root,0);

        }
        private int get(int index,Node node,int currentIndex){
        if(index==currentIndex) return node.value;
        else  return get(index,node.next,currentIndex+1);

        }


    @Override
    public boolean add(int value) {return add(value,root);
    }
    private boolean add(int data,Node node){
        if (node==null) node =new Node(data);
        else add(data,node.next);
        return true;
    }

    @Override
    public boolean add(int index, int value) {return add(index,value,root,0);

    }

    @Override
    public int remove(int number) {
        if (contains(number))
        return remove(number,root,0);
        else return 0;
    }
    private int remove(int number,Node node,int currentIndex){
        if(node.value==number){node =null;
        Node prev=getNodebyIndex(currentIndex-1);prev.next=node.next;}
        else return remove(number,node.next,currentIndex+1);
        return node.value;
    }

    private boolean add(int index,int value,Node current, int currentIndex){
        if(index==currentIndex){current.value=value;}
        else {add(index,value,current.next,currentIndex+1);
        Node previos=getNodebyIndex(index-1);
       current.next=previos.next;
       previos.next=current;
    }return true;}


    public  Node getNodebyIndex(int index){ return getNodebyIndex(index,root,0) ;}

  private Node getNodebyIndex(int index,Node node,int currentIndex){
        if (index==currentIndex) return node;
        else return getNodebyIndex(index,node.next,currentIndex+1);
  }
//
//    @Override
//    public int remove(int number) {return remove(number,root);
//
//        }
//
//        private int remove(int number,Node node){
//        if(node.value==number)node=null;
//        else {remove(number,node.next);Node previos=get
//
//
//        }

    @Override
    public int removeByIndex(int index) {
    return removeByIndex(index,root);}
    private int  removeByIndex(int index,Node node){
       Node removed= getNodebyIndex(index);
       Node previos=getNodebyIndex(index-1);
       previos.next=removed.next;
       removed=null;return removed.value;
    }

    @Override
    public boolean contains(int value) {
      return contains(value,root);
    }
    private boolean contains(int value,Node node){
        if (node.value==value) return true;
        else  return contains(value,node.next);
    }

    @Override
    public boolean set(int index, int value) {
    return set(index,value,root);}
    private boolean set(int index,int value,Node node){
        Node SetNode=getNodebyIndex(index);
        SetNode.value=value;return true;
    }

    @Override
    public void print() {

        print(root);
    }

    private void print(Node node){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<=size();i++){
            sb.append(node.value);sb.append(",");
            node=node.next;
        }
        sb.append("]");
        System.out.println(sb.toString());

    }

    @Override
    public int[] toArray() {
        return toArray(root,0);

    }
    private int []toArray(Node node,int index){
        int[]array=new int[size()-1];
        if(!(root==null))
        array[index]=node.value;
        toArray(node.next,index+1);return array;
    }

    @Override
    public boolean removeAll(int[] ar) {
       return removeAll(ar,root);
    }
    private boolean removeAll(int[]ar,Node node){
        for(int i=0;i<ar.length;i++){
            remove(ar[i]);
        }return true;


    }
}
