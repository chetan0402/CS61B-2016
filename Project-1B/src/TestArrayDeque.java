import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestArrayDeque {
    @Test
    public void testInit(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();

        assertEquals(0,test_deque.size());
        assertTrue(test_deque.isEmpty());
    }

    @Test
    public void testAddFirst(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();
        test_deque.addFirst(2);
        test_deque.addFirst(1);

        assertEquals(1,(int)test_deque.get(0));
        assertEquals(2,(int)test_deque.get(1));
        assertEquals(2,test_deque.size());
    }

    @Test
    public void testAddLast(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);

        assertEquals(1,(int)test_deque.get(0));
        assertEquals(2,(int)test_deque.get(1));
        assertEquals(2,test_deque.size());
    }

    @Test
    public void print(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);

        test_deque.printDeque();
    }

    @Test
    public void testRemoveFirst(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);

        assertEquals(1,(int) test_deque.removeFirst());
        assertEquals(2,(int) test_deque.get(0));
        assertEquals(1,test_deque.size());
    }

    @Test
    public void testRemoveLast(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();
        test_deque.addLast(1);
        test_deque.addLast(2);

        assertEquals(2,(int) test_deque.removeLast());
        assertEquals(1,(int) test_deque.get(0));
        assertEquals(1,test_deque.size());
    }

    @Test
    public void testResize(){
        StudentArrayDeque<Integer> test_deque=new StudentArrayDeque<>();
        for (int i = 0; i < 12; i++) {
            test_deque.addLast(i);
        }
        for (int i = 0; i < 10; i++) {
            test_deque.removeLast();
        }
        assertEquals(2,test_deque.size());
        assertEquals(0,(int) test_deque.get(0));
        assertEquals(1,(int) test_deque.get(1));
    }
}
