//Wap to print factors of any number.

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1,c = 0;
        while(num>=i)
        {
            if(num%i==0)
            {
                System.out.println(i +" ");
                c++;
            }
            i++;
            


        }
        System.out.println(c);

        if(c == 2)
        {
            System.out.println("Num is prime..");
        }
    
    }
    
}
