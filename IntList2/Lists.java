/* NOTE: The file Utils.java contains some functions that may be useful
 * in testing your answers. */

/** HW #2, Problem #1. */

/** List problem.
 *  @author
 */
class Lists {
    /** Return the list of lists formed by breaking up L into "natural runs":
     *  that is, maximal strictly ascending sublists, in the same order as
     *  the original.  For example, if L is (1, 3, 7, 5, 4, 6, 9, 10, 10, 11),
     *  then result is the four-item list ((1, 3, 7), (5), (4, 6, 9, 10), (10, 11)).
     *  Destructive: creates no new IntList items, and may modify the
     *  original list pointed to by L. */
    static IntList2 naturalRuns(IntList L) {
        if(L == null) return new IntList2();

        IntList current = L;
        IntList2 result = new IntList2();
        IntList2 L2 = result;

        while(current != null) {
            if(current.tail == null) {
                L2.head = L;
                current = current.tail;
            } else if(current.tail.head > current.head) {
                current = current.tail;
            } else{
                L2.head = L;
                L2.tail = new IntList2();
                L2 = L2.tail;
                L = current.tail;
                current.tail = null;
                current = L;
            }  
        }
        return result;
    }
}
