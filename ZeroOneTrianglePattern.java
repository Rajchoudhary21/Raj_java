public class ZeroOneTrianglePattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            int num;
            if(i%2 == 0)
            {
                num = 0;
            }
            else{
                num = 1;
            }

            for(j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                     num = 1 - num;
            }
       
            System.out.println();
        }
    }
}
