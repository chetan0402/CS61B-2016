import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {
    @Test
    public void TestResize(){
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addFirst(i);
        }
        /*{7, 6, 5, 4, 3, 2, 1, 0, null, null, 13, 12, 11, 10, 9, 8}*/
        assertEquals(13,(int) test_array.get(1));
        assertEquals(7,(int) test_array.get(7));
    }

    @Test
    public void testAddLast(){
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addLast(i);
        }
        /*{null,0,1,2,3,4,5,6,7,8,9,10,11,12,13,null}*/
        assertEquals(3,(int) test_array.get(4));
    }

    @Test
    public void testRemoveFirst(){
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addFirst(i);
        }
        /*{7, 6, 5, 4, 3, 2, 1, 0, null, null, 13, 12, 11, 10, 9, 8}*/
        assertEquals(13,(int) test_array.removeFirst());
        /*{7, 6, 5, 4, 3, 2, 1, 0, null, null, null, 12, 11, 10, 9, 8}*/
        assertEquals(12,(int) test_array.get(1));
    }

    @Test
    public void testRemoveLast(){
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addFirst(i);
        }
        /*{7, 6, 5, 4, 3, 2, 1, 0, null, null, 13, 12, 11, 10, 9, 8}*/
        assertEquals(0,(int) test_array.removeLast());
        /*{7, 6, 5, 4, 3, 2, 1, null, null, null, 13, 12, 11, 10, 9, 8}*/
        assertEquals(1,(int) test_array.get(test_array.size()));
    }

    @Test
    public void testClean(){
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addFirst(i);
        }
        /*{7, 6, 5, 4, 3, 2, 1, 0, null, null, 13, 12, 11, 10, 9, 8}*/
        for (int i = 0; i < 13; i++) {
            test_array.removeFirst();
        }
        System.out.println(Arrays.toString(test_array.rawArray()));
    }

    @Test
    public void printStatement(){
        ArrayDeque<Integer> test_array=new ArrayDeque<>();
        for (int i = 0; i < 14; i++) {
            test_array.addFirst(i);
        }
        /*{7, 6, 5, 4, 3, 2, 1, 0, next, prev, 13, 12, 11, 10, 9, 8}*/
        test_array.printDeque();
    }
}
