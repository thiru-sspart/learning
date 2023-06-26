package test;

public class Exam {
   int i=9;
    static int o=0;
    {
        o++;
    }

    public  void a() {
       int i=8;
       System.out.println(this.i);
    }

//    public static void a(Object ob){
//        System.out.println();
//    }println
    public  static  void  main(String args[]) {
        Exam e= new Exam();
        e.a();
//   int ar[] = {0,1,0,1,1,0,0};
//   int res[]= new int[ar.length];
//   int count=0;
//   for(int num:ar) {
//       if(num == 0) {
//           count++;
//       }
//   }
//   System.out.println(Math.min(count, ar.length-count));
//     for(int i=0; i<count; i++) {
//         res[i]=0;
//     }
//
//     for(int i=count; i<ar.length; i++) {
//         res[i]= 1;
//     }
//
//     for(int num: res) {
//         System.out.println(num);
//     }

//        Map<Map<String, Integer>, Integer> map= new HashMap();
//
//        Map<String, Integer> m= new HashMap<>();
//        m.put("a", 1);
//        m.put("b", 1);
//        map.put(m, 1);
//        System.out.println(map);
//        test.Exam e= new test.Exam();
//        test.Exam f= new test.Exam();
//        System.out.println(o);
//        String s1= "Hello";
//        String s2= "Hello";
//        System.out.println(s1.compareTo(s2));
    }
}
