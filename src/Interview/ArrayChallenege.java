package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayChallenege {

    public static void main(String args[]) {
        System.out.println(arracyCh(new int[]{3,1,2,6,10}));
    }
     public static int arracyCh(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int max =0;

        for(int e:arr) {
            map.put(e, map.getOrDefault(e, 0)+1);
            max= Math.max(max, map.get(e));
        }

        if(max ==1) return -1;

        int result= -1;

        for(int e: map.keySet()) {
            if(max == map.get(e)) {
                result = e;
                break;
            }
        }
        return result;
    }
}
