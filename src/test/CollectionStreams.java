package test;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionStreams extends ExamF{
//    public final void m1() {
//
//    }

    //Final method cannot be overridden

    public static void main(String args[]) {

        Sample.m2();
        List<Integer> list= new ArrayList(Arrays.asList(1,2,3,4));
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("a", 2);

//        for(Map.Entry<String, Integer> m : map.entrySet()) {
//            System.out.println(m.getValue()
//            );
//        }
//
        Map<String, Integer> li=map.entrySet().stream().filter(n->n.getValue()==2).collect(Collectors.toMap(z->z.getKey(), z->z.getValue()*2));
        System.out.println(li);

        Map<String, Integer> li1=map.entrySet().stream().collect(Collectors.toMap(z->z.getKey(), z->z.getValue()*2));
        System.out.println(li1);

        List<Integer> res= list.stream().map(m->m=m*2).collect(Collectors.toList());
        System.out.println(res);

        List<String> resL = map.entrySet().stream().filter(n->n.getValue()==2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(resL);

    }
}
