package test;

public class SpecialCharsInString {

    public static void main(String args[]) {
        String s= "Thiru$#@%^&mala";
        String finRes= "";
        String alp= s.replaceAll("[$#@^&%]", " ");
        System.out.println(alp);
        String r[]= alp.split(" ");
        for(String o: r) {
            finRes= finRes+o;
        }
        String spCha= s.replaceAll("[^a-z A-Z]", "");
        System.out.println(spCha);
        String spC[]= spCha.split(" ");
        for(String o: spC) {
            finRes= finRes+o;
        }
        System.out.println(finRes);

        // Numbers in String
        String i= "thiru7346mala45674";
        String th= i.replaceAll("[a-z A-Z]", "");
//        String x[]= i.split("[a-z A-Z]");
//        String fin="";
//        for(String o: x) {
//            fin= o+" "+fin;
//        }
        System.out.println(th);
    }
}
