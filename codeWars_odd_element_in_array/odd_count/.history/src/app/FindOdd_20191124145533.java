package app;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class FindOdd {
    
    
    public static void main(String [] args) {
        int [] a= new int[] {1,1,1,1,1,1,10,1,1,1,1};
        System.out.println(findIt(a));
    }
    
    
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> countDictionary = new HashMap<>();
        for (int i = 0; i < a.length; i += 1) {
            if (countDictionary.containsKey(a[i])) {
                countDictionary.put(a[i], countDictionary.get(a[i]) + 1);
            } else {
                countDictionary.put(a[i], 1);

            }
        }
        System.out.println(Arrays.toString(countDictionary.entrySet().toArray()));
        
        for (Map.Entry<Integer, Integer> entry:countDictionary.entrySet())
        {
            if (entry.getValue() %2 == 1)
                return entry.getKey();
        }
        return -1;
    
    }
}