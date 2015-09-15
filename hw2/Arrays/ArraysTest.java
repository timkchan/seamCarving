import org.junit.Test;
import static org.junit.Assert.*;


/** Perform tests for Arraus class
 *  @author Tim Chan
 */

public class ArraysTest {

    /** Test for catenate */
    @Test
    public void TestCatenate(){
		int[] A = {};
    	int[] B = {1, 2, 3};
    	int[] result = Arrays.catenate(A, B);
    	assertEquals(Utils.equals(new int[] {1, 2, 3}, result), true);
    	assertEquals(Utils.equals(new int[] {}, A), true);
    	assertEquals(Utils.equals(new int[] {1, 2, 3}, B), true);

    	A = new int[] {1, 2, 3};
    	B = new int[] {};
    	result = Arrays.catenate(A, B);
    	assertEquals(Utils.equals(new int[] {1, 2, 3}, result), true);
    	assertEquals(Utils.equals(new int[] {1, 2, 3}, A), true);
    	assertEquals(Utils.equals(new int[] {}, B), true);

		A = new int[] {1, 2, 3};
    	B = new int[] {4, 5, 6};
    	result = Arrays.catenate(A, B);
    	assertEquals(Utils.equals(new int[] {1, 2, 3, 4, 5, 6}, result), true);
    	assertEquals(Utils.equals(new int[] {1, 2, 3}, A), true);
    	assertEquals(Utils.equals(new int[] {4, 5, 6}, B), true);
    }

    /** Test for remove */
    @Test
    public void TestRemove(){
    	int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    	int[] result = Arrays.remove(A, 3, 3);
    	assertEquals(Utils.equals(new int[] {1, 2, 3, 7, 8, 9, 10}, result), true);

    	result = Arrays.remove(A, 0, 0);
    	assertEquals(Utils.equals(A, result), true);

    	result = Arrays.remove(A, 0, 3);
    	assertEquals(Utils.equals(new int[] {4, 5, 6, 7, 8, 9, 10}, result), true);

    	result = Arrays.remove(A, 0, 10);
    	assertEquals(Utils.equals(new int[] {}, result), true);

    }

    public static void main(String[] args) {
        System.exit(ucb.junit.textui.runClasses(ArraysTest.class));
    }
}
