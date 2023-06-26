public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> test_deque=new ArrayDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);
        test_deque.addLast(3);

        for (int thing: test_deque) {
            System.out.println(thing);
        }
    }
}
