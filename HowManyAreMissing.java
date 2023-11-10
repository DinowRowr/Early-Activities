import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RLVillacarlos
 */
public class HowManyAreMissing {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        
        var n = in.nextInt();
        var lo = in.nextInt();
        var hi = in.nextInt();
        
        Integer[] l = new Integer[n];
        
        for(int i = 0; i < n; i++){
            l[i] = in.nextInt();
        }
        
        Arrays.sort(l);
        
		//Find the index of smallest element in l that is greater than lo
        var succ = findSuccessorIndex(l, lo);
		
		//Find the index of largest element in l that is less than hi
        var pred = findPredecessorIndex(l, hi);
               
        int countInRage;
        
		/**
		 *If either the successor or predecessor is not found then
		 *no element in [lo,hi] is in l
		 *
		 *Otherwise, the number of element of [lo,hi] is the number 
		 *of elements between the successor of lo and predecessor of hi 
		 *(including both the successor and predecessor).
		 */
        if (succ == -1 || pred == -1){
            countInRage = 0;
        }else{
            countInRage = pred - succ + 1;
        }
		
		/**
		*The number of  elements of [lo,hi] not in l 
		*is simply the number of elements of [lo,hi] minus
		*those elements of [lo,hi] in l
		*/
        System.out.println((hi - lo + 1) - countInRage);
    }
    
    /**
     * The successor of x in l is the smallest element in l 
     * greater than or equal to x
     */
    static int findSuccessorIndex(Integer[] l, Integer x){
        var lo = 0;
        var hi = l.length - 1;
        var mid = 0;
        
        //Try to find x and if it is found then x is the successor of itself
        while (lo <= hi){
            mid = lo + (hi - lo )/2;
            int cmp_res = l[mid].compareTo(x);
            if (cmp_res == 0){
                return mid;
            }else if (cmp_res > 0){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        
        /**
         * If x is not found and the last middle element checked is 
         * greater than x then this is the successor of x.
         * 
         * If the middle element is not greater than x and is not the last 
         * element in l, then the successor of x in l is the element after the
         * last middle element.
         * 
         * Otherwise, x has no successor in l
         **/
        if(l[mid].compareTo(x) > 0){
            return mid;
        }else if(mid < l.length - 1){
            return mid + 1;
        }
        return -1;
        
    }
    
    /**
     * The predecessor of x in l is the greatest element in l 
     * less than or equal to x
     */
    static int findPredecessorIndex(Integer[] l, Integer x){
        var lo = 0;
        var hi = l.length - 1;
        var mid = 0;
        
        //Try to find x and if it is found then x is the predecessor of itself
        while (lo <= hi){
            mid = lo + (hi - lo )/2;
            int cmp_res = l[mid].compareTo(x);
            if (cmp_res == 0){
                return mid;
            }else if (cmp_res > 0){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        /**
         * If x is not found and the last middle element checked is 
         * greater than x then this is the successor of x.
         * 
         * If the middle element is not greater than x and is not the last 
         * element in l, then the successor of x in l is the element after the
         * last middle element.
         * 
         * Otherwise, x has no successor in l
         **/
        if(l[mid].compareTo(x) > 0){
            if(mid > 0 ){
                return mid - 1;
            }
            return -1;
        }
        return mid;
    }
}
