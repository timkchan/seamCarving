import org.junit.Test;
import static org.junit.Assert.*;

/** Test for MatrixUtils class.
 *  @author Tim Chan
 */

public class MatrixUtilsTest {
    /** Test for accumulateVertical.*/
    @Test
    public void TestAccumulateVertical() {
    	double[][] e = new double[][] {{1000000, 1000000, 1000000, 1000000},
						{1000000, 75990, 30003, 1000000},
						{1000000, 30002, 103046, 1000000},
						{1000000, 29515, 38273, 1000000},
						{1000000, 73403, 35399, 1000000},
 						{1000000, 1000000, 1000000, 1000000}};

 		double[][] am =new double[][] {{1000000, 1000000, 1000000, 1000000},
						{2000000, 1075990, 1030003, 2000000},
						{2075990, 1060005, 1133049, 2030003},
						{2060005, 1089520, 1098278, 2133049},
						{2089520, 1162923, 1124919, 2098278},
 						{2162923, 2124919, 2124919, 2124919}};

 		double[][] result = MatrixUtils.accumulateVertical(e);
 		
 		
        assertEquals(java.util.Arrays.deepEquals(result, am), true);
    }

    /** Test for transpose.*/
    @Test
    public void TestTranspose() {
		double[][] a =new double[][] {	{1, 2 ,3, 4},
										{5, 6, 7, 8},
										{9, 10, 11, 12}};

		double[][] b =new double[][] {	{1, 5 ,9},
										{2, 6, 10},
										{3, 7, 11},
										{4, 8, 12}};
		//System.out.println(java.util.Arrays.deepToString(MatrixUtils.transpose(a)));
		assertEquals(java.util.Arrays.deepEquals(MatrixUtils.transpose(a), b), true);
	}


	/** Test for minArray.*/
    @Test
    public void TestMinArray() {
		double [][] a = new double[6][];
	    a[0] = new double[] {1000000, 1000000, 1000000, 1000000};
	    a[1] = new double[] {1000000, 75990, 30003, 1000000};
	    a[2] = new double[] {1000000, 30002, 103046, 1000000};
	    a[3] = new double[] {1000000, 29515, 38273, 1000000};
	    a[4] = new double[] {1000000, 73403, 35399, 1000000};
	    a[5] = new double[] {1000000, 1000000, 1000000, 1000000};
	    //double [][] b = MatrixUtils.accumulate(a, Orientation.VERTICAL);
	    //System.out.println(MatrixUtils.matrixToString(b));
	    //System.out.println();
	    //double [][] c = MatrixUtils.accumulate(a, Orientation.HORIZONTAL);
	    //System.out.println(MatrixUtils.matrixToString(c));
	}

	/** Test for minArray.*/
    @Test
    public void TestMinArray() {
		double[][] a =new double[][] {	{8, 2 ,3, 4},
										{10, 6, 7, 0},
										{9, 10, 121, 12}};
		int[] result = new int[a.length];
		//for(int i = 0; i < a.length; i += 1) System.out.println(MatrixUtils.minArray(a[i]));
		//System.out.println(java.util.Arrays.toString(result));
		//assertEquals(java.util.Arrays.Equals(result, new int[]{1, 3, 0}), true);
		//assertEquals(Utils.equals(new int[] {1, 3, 0}, result), true);
	}

	/** Test for minArray.*/
    @Test
    public void TestFindVerticalSeam() {
    	double[][] am =new double[][] {{1000000, 1000000, 1000000, 1000000},
						{2000000, 1075990, 1030003, 2000000},
						{2075990, 1060005, 1133049, 2030003},
						{2060005, 1089520, 1098278, 2133049},
						{2089520, 1162923, 1124919, 2098278},
 						{2162923, 2124919, 2124919, 2124919}};

 		//System.out.println(java.util.Arrays.toString(MatrixUtils.findVerticalSeam(am)));


	}





    public static void main(String[] args) {
        System.exit(ucb.junit.textui.runClasses(MatrixUtilsTest.class));
    }
}
