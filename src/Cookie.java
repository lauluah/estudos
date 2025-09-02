public class Cookie {
    public static String cookie(Object input) {
        String who;

     if(input instanceof Integer || input instanceof Float) {
         who = "monica";
     } else if (input instanceof String) {
        who = "zach";
     } else {
        who = "dog";
     }
     return "who ate the cookie: " + who;
    }
}
