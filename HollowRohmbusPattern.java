public class HollowRohmbusPattern {
    public static void main(String args[])
    {
        int i,j,k,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=n;k++)
            {
                if(i==1 || i==n || k==1 || k==5)
                 { System.out.print("*");}
                  else{
                    System.out.print(" ");
                      }
            }
                    System.out.println();

        }
    }
}


