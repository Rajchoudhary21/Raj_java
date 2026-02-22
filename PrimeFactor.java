

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int n = sc.nextInt();
        
        
       for(int i =2;i<=n;)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                n = n/i;
            }
            else
            {
                i++;
            }
            
        }
    }
    
    
}
