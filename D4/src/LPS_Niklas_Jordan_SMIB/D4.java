package LPS_Niklas_Jordan_SMIB;

public class D4 {

    public static void main(String[] args) {

       final String team = "team";
       final String person = "person";
       final String vorname = "vorname";
       final String nachname = "nachname";
       final String alias = "alias";

       String test = new String("<team>\n" + "<person><vorname>Robin</vorname><nachname>Radd</nachname><alias>Silver\n" + "Surfer</alias></person>\n" + "<person><vorname>Ben</vorname><nachname>Grimm</nachname><alias>Das\n" + "Ding</alias></person></team>");

       int a = test.indexOf("<person>");
       int b = test.indexOf("</person>");
       System.out.println(test.substring(a,b));

       int c = test.indexOf("<person>");
       int d = test.indexOf("</person>");
       System.out.println(test.substring(c,d));


       /*
       String vorname1 = new String("Robin");
       System.out.println(test.indexOf(vorname1));
       System.out.println(test.substring(24, 29));

       String nachname1 = new String("Radd");
       System.out.println(test.indexOf(nachname1));
       System.out.println(test.substring(49, 53));

       String alias11 = new String("Silver");
       System.out.println(test.indexOf(alias11));
       System.out.println(test.substring(71, 77));

       String alias12 = new String("Surfer");
       System.out.println(test.indexOf(alias12));
       System.out.println(test.substring(78, 84));
       */
    }
}
