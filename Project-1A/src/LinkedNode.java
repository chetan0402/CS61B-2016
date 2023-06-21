public class LinkedNode<Generic> {
    public LinkedNode<Generic> prev;
    public LinkedNode<Generic> next;
    public Generic info;

    public LinkedNode(){}

    public LinkedNode(Generic info,LinkedNode<Generic> prev,LinkedNode<Generic> next){
        this.info=info;
        this.prev=prev;
        this.next=next;
    }
}
