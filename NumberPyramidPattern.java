public class NumberPyramidPattern {
    public static void main(String[] args) {
        int i,j,n=0;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");

            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
         for(i=4;i>=1;i--)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(" ");

            }
            for(j=i;j>=1;j--)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
        
        }
    
}
