public class ArrayDeque<Generic> {
    private int prev;
    private int next;
    private int size;
    private Generic[] array;

    public ArrayDeque(){
        size=0;
        prev=4;
        next=5;
        array=(Generic[]) new Object[8];
    }

    public void addFirst(Generic item){
        if(prev==next) {
            upgrade();
        }

        array[prev]=item;
        size=size+1;

        if(prev==0){
            prev=array.length-1;
        }else{
            prev=prev-1;
        }
    }

    public void addLast(Generic item){
        if(prev==next) {
            upgrade();
        }

        array[next]=item;

        if(next==array.length-1){
            next=0;
        }else{
            next=next+1;
        }
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int size(){
        return size;
    }

    public void printDeque(){}

    public Generic removeFirst(){
        return null;
    }

    public Generic removeLast(){
        return null;
    }

    public void clean(){}

    public void upgrade(){
        Generic[] new_array=(Generic[]) new Object[2* array.length];
        if(prev==0){
            System.arraycopy(array,prev+1,new_array,1,array.length);
        }else{
            System.arraycopy(array,prev+1,new_array,1,array.length-prev-1);
            System.arraycopy(array,0,new_array,array.length-prev,prev+1);
        }
        prev=0;
        next=array.length;
        array=new_array;
    }

    public Generic get(int index){
        if(prev+index < array.length){
            return array[prev+index];
        }else{
            index=index-(array.length-prev);
            return array[index];
        }
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addLast(i);
        }
    }
}
