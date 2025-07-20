public class Solution {
    public static boolean divby13(String s)
    {
        int n = Integer.parseInt(s);
        boolean r = n % 13 == 0;
       return r;
    }
    public static void main(String args[])
    {
      System.out.println(divby13("2911285"));
    
    }
}
