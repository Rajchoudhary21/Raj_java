public class PairsOfArray {
    public static void pairs(int num[])
    {
        int c = 0;
        for(int i = 0; i<num.length;i++)
        {
            int curr = num[i];
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("("+ curr + "," + num[j] + ")");
                c++;
            }
            System.out.println();
        }
        System.out.print("Total Pairs : "+c);

    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6 };
        pairs(num);
    }
    
}
