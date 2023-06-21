import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedListDeque {
    @Test
    public void testInitSize(){
        LinkedListDeque<Integer> test_list=new LinkedListDeque<Integer>();
        assertEquals(0,test_list.getSize());
    }

    @Test
    public void testEmpty(){
        LinkedListDeque<Integer> test_list=new LinkedListDeque<Integer>();
        assertTrue(test_list.isEmpty());

        test_list.addFirst(1);
        assertFalse(test_list.isEmpty());
    }

    @Test
    public void testGet(){
        LinkedListDeque<Integer> test_list= new LinkedListDeque<>();
        test_list.addFirst(1);
        test_list.addFirst(2);

        assertEquals(2,(int) test_list.get(1));
    }

    @Test
    public void testLast(){
        LinkedListDeque<Integer> test_list= new LinkedListDeque<>();
        test_list.addLast(1);
        test_list.addLast(2);

        assertEquals(1,(int) test_list.get(1));
    }

    @Test
    public void testPrintList(){
        LinkedListDeque<Integer> test_list= new LinkedListDeque<>();
        test_list.addLast(1);
        test_list.addLast(2);

        test_list.printDeque();
    }

    @Test
    public void testRemoveFirst(){
        LinkedListDeque<Integer> test_list= new LinkedListDeque<>();
        test_list.addLast(1);
        test_list.addLast(2);

        assertEquals(1,(int) test_list.removeFirst());
        assertEquals(2,(int) test_list.get(1));
    }

    @Test
    public void testRemoveLast(){
        LinkedListDeque<Integer> test_list= new LinkedListDeque<>();
        test_list.addLast(2);
        test_list.addLast(1);

        assertEquals(1,(int) test_list.removeLast());
        assertEquals(2,(int) test_list.get(1));
    }
}
