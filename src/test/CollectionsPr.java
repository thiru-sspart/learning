package test;

import java.util.*;

public class CollectionsPr {

    public static void main(String args[]) {
//        List<String> li = new ArrayList<>();
//        li.add("ABC");
//        li.add("abc");
//        li.add("");
//        li.add("abc");
//
//        for (String s: li) {
//            System.out.println(s);
//        }
//        System.out.println("Linked List");
//        List<String> list = new LinkedList<>();
//        list.add("ABC");
//        list.add("abc");
//        list.add();
//        list.add("abc");
//
//        for (String s: list) {
//            System.out.println(s);
//        }
//        List<String> v = new Vector<>();
//        v.add("ABC");
//        v.add("abc");
//        v.add(null);
//        for (String i:v) {
//            System.out.println(i);
//        }
        //Single thread

//        Stack<String> st = new Stack<>();
//        st.push("ABC");
//        st.push("abc");
//        st.push(null);
//       // st.add("abc");
//        System.out.println(st.pop());
//        for (String i:st) {
//            System.out.println(i);
//        }

        //Sorted
//        Set<String> set = new HashSet<>();
//        set.add("A");
//        set.add("C");
//        set.add("B");
//        set.add(null);
//        for (String i:set) {
//            System.out.println(i);
//        }

//        //Null is not accepted & sorted
//        Set<String> set = new TreeSet<>();
//        set.add("A");
//        set.add("C");
//        set.add("B");
//       // set.add(null);
//        for (String i:set) {
//            System.out.println(i);
//        }

//       Map<Integer, String> map = new HashMap<>();
//       map.put(1, "A");
//       map.put(2, "B");
//       map.put(4, "C");
//       map.put(null, null);
//       map.put(0, "D");
//        for (Map.Entry i:map.entrySet()) {
//            System.out.println(i.getValue());
//        }

//        Queue<String> qu = new PriorityQueue<>();
//        qu.add("A");
//        qu.add("B");
//        qu.remove("B");
//        qu.poll();
//
//
//        for (String s:qu) {
//            System.out.println(s);
//        }

        ArrayDeque<String> qu = new ArrayDeque<>();
        qu.add("A");
        qu.add("B");
        qu.add("A");
        qu.remove("B");
        qu.add("C");
        qu.poll();
        qu.addFirst("F");


        for (String s:qu) {
            System.out.println(s);
        }


    }
}
