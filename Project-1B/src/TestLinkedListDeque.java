import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLinkedListDeque {
    @Test
    public void testInit(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();

        assertEquals(0,test_deque.size());
        assertTrue(test_deque.isEmpty());
    }

    @Test
    public void testAddFirst(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();
        test_deque.addFirst(2);
        test_deque.addFirst(1);

        assertEquals(1,(int) test_deque.get(0));
        assertEquals(2,(int) test_deque.get(1));
        assertEquals(2,test_deque.size());
    }

    @Test
    public void testAddLast(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);

        assertEquals(1,(int) test_deque.get(0));
        assertEquals(2,(int) test_deque.get(1));
        assertEquals(2,test_deque.size());
    }

    @Test
    public void testRGet(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);

        assertEquals(1,(int) test_deque.getRecursive(0));
        assertEquals(2,(int) test_deque.getRecursive(1));
    }

    @Test
    public void testRemoveLast(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();
        LinkedListDequeSolution<Integer> compare_deque=new LinkedListDequeSolution<>();
        test_deque.addLast(1);
        compare_deque.addLast(1);
        test_deque.addLast(2);
        compare_deque.addLast(2);

        assertEquals((int)compare_deque.removeLast(),(int) test_deque.removeLast());
        assertEquals(compare_deque.size(),test_deque.size());
        assertEquals((int)compare_deque.get(0),(int) test_deque.get(0));
    }

    @Test
    public void testRemoveFirst(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();
        LinkedListDequeSolution<Integer> compare_deque=new LinkedListDequeSolution<>();
        test_deque.addFirst(1);
        compare_deque.addFirst(1);
        test_deque.addFirst(2);
        compare_deque.addFirst(2);

        assertEquals((int)compare_deque.removeFirst(),(int) test_deque.removeFirst());
        assertEquals(compare_deque.size(),test_deque.size());
        assertEquals((int)compare_deque.get(0),(int) test_deque.get(0));
    }

    @Test
    public void testPrint(){
        StudentLinkedListDeque<Integer> test_deque=new StudentLinkedListDeque<>();
        LinkedListDequeSolution<Integer> compare_deque=new LinkedListDequeSolution<>();
        test_deque.addFirst(1);
        compare_deque.addFirst(1);
        test_deque.addFirst(2);
        compare_deque.addFirst(2);

        test_deque.printDeque();
        compare_deque.printDeque();
    }
}
