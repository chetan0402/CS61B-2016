public class LinkedListDeque<Generic> {
    private final LinkedNode<Generic> ref_node= new LinkedNode<>();
    private int size;

    public LinkedListDeque(){
        ref_node.prev=ref_node;
        ref_node.next=ref_node;
        size=0;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(Generic info){
        LinkedNode<Generic> new_next=ref_node.next;
        LinkedNode<Generic> new_node= new LinkedNode<>(info, ref_node, new_next);
        new_next.prev=new_node;
        ref_node.next=new_node;
        size=size+1;
    }

    public void addLast(Generic info){
        LinkedNode<Generic> new_prev=ref_node.prev;
        LinkedNode<Generic> new_node=new LinkedNode<>(info,new_prev,ref_node);
        new_prev.next=new_node;
        ref_node.prev=new_node;
        size=size+1;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void printDeque(){
        StringBuilder final_print= new StringBuilder();

        int i=0;
        LinkedNode<Generic> currentNode=ref_node;
        while(i<size){
            currentNode=currentNode.next;
            i=i+1;

            final_print.append(" ").append(currentNode.info);
        }

        System.out.println(final_print);
    }

    public Generic removeFirst(){
        LinkedNode<Generic> node_removed=ref_node.next;
        Generic info=node_removed.info;
        node_removed.info=null;
        ref_node.next=ref_node.next.next;
        ref_node.next.prev=ref_node;
        return info;
    }

    public Generic removeLast(){
        LinkedNode<Generic> node_removed=ref_node.prev;
        Generic info=node_removed.info;
        node_removed.info=null;
        ref_node.prev=ref_node.prev.prev;
        ref_node.prev.next=ref_node;
        return info;
    }

    private LinkedNode<Generic> getNode(int index){
        int i=0;
        LinkedNode<Generic> currentNode=ref_node;
        while(i<index){
            currentNode=currentNode.next;
            i=i+1;
        }
        return currentNode;
    }

    public Generic get(int index){
        return getNode(index).info;
    }
}
