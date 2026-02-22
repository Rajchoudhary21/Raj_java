public class SubArray {
    public static void subArray(int num[])
    {
        int ts =0; 
        int max = 0;
        int min = 100;
        for(int i=0;i<num.length;i++)
        {
            for(int j = i;j<num.length;j++)
            {
                int sum = 0;
                for(int k = i;k<=j;k++)
                {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }
                System.out.println();
                System.out.println("sum = "+sum);
                if(sum > max)
                {
                    max = sum;
                }
                if(sum < min)
                {
                    min = sum;

                }
                
                ts++;
            }
            System.out.println();
           
        }
         System.out.println("Total Sub arrays = "+ts);
         System.out.println("maximum = "+max);
         System.out.println("Minimum = "+min);
    }
    public static void main(String args[])
    {
        int num[] = {2,4,6,8,10};
        subArray(num);
    }
    
}
