package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrowEx {

    public static void main(String args[]) {
        Map<Integer, Integer> map= new HashMap<>();
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(1);
        li.add(6);

        li= li.stream().filter(x-> x>4).collect(Collectors.toList());
//        System.out.println(li);

        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);

        map= map.entrySet().stream().filter(x-> x.getValue().intValue()>4).collect(Collectors.toMap(y-> y.getKey(), z->z.getValue()));
        System.out.println(map);
        li=map.values().stream().collect(Collectors.toList());
        System.out.println(li);
        li= map.keySet().stream().toList();
        System.out.println(li);

    }
}
