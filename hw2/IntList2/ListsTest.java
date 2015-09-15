import org.junit.Test;
import static org.junit.Assert.*;

/** Perform tests of the IntList2 class
 *
 *  @author Tim Chan
 */

public class ListsTest {

    /** Test for the funciton naturalRuns */
    @Test
    public void testNaturalRuns() {

        //Test 1: Long L
        IntList L = IntList.list(1, 3, 7, 5, 4, 6, 9, 10, 10, 11);
        IntList2 L2 = Lists.naturalRuns(L);

        int[][] A = new int[][] {{1, 3, 7}, {5}, {4, 6, 9, 10}, {10, 11}};
        IntList2 expected = IntList2.list(A);

        assertEquals(expected, L2);

        //Test 2: Singlton
        L = IntList.list(1);
        L2 = Lists.naturalRuns(L);

        A = new int[][] {{1}};
        expected = IntList2.list(A);

        assertEquals(expected, L2);

        //Test 3: Empty L
        L = IntList.list();
        L2 = Lists.naturalRuns(L);

        expected = new IntList2();

        assertEquals(expected, L2);

    }
    // It might initially seem daunting to try to set up
    // Intlist2 expected.
   	//
    // There is an easy way to get the IntList2 that you want in just
    // few lines of code! Make note of the IntList2.list method that
    // takes as input a 2D array.

    public static void main(String[] args) {
        System.exit(ucb.junit.textui.runClasses(ListsTest.class));
    }
}
