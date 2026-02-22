public class DiomndPattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i+1;j--)
            {
               System.out.print(" "); 
            }
            for(j=1;j<=i+(i-1);j++)
            {
               System.out.print("*"); 
            }
            System.out.println();
        }

         for(i=4;i>=1;i--)
        {
            for(j=4;j>=i+1;j--)
            {
               System.out.print(" "); 
            }
            for(j=1;j<=i+(i-1);j++)
            {
               System.out.print("*"); 
            }
            System.out.println();
        }

        
    }
    
}
