package app;
import java.util.HashMap;
import java.util.Arrays;

public class FindOdd {
    
    
    public static void main(String [] args) {
        int [] a= new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        findIt(a);
    }
    
    
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> countDictionary = new HashMap<>();
        for (int i = 0; i < a.length; i += 1) {
            if (countDictionary.containsKey(i)) {
                countDictionary.put(i, countDictionary.get(i) + 1);
            } else {
                countDictionary.put(i, 1);

            }
        }
        System.out.println(Arrays.toString(countDictionary.entrySet().toArray()));
        return 66;
    }
}