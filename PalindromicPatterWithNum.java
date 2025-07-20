public class PalindromicPatterWithNum {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            if(i!=1){
             for(j=2;j<=i;j++)
            {
                System.out.print(j);
            }}
            System.out.println();
        }
    }
}
