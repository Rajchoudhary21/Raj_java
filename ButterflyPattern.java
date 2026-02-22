public class ButterflyPattern {
    public static void butterflyPattern(int n)
    {
        int j;
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
             System.out.println();
            

        }
        for(int i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPattern(7);
    
    }
    
}
