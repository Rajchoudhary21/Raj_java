import java.util.Scanner;

public class DecimaltoBinary{
     public static void decToBin(int n) {  
        int binNum = n;
        int pow = 0;
        int bin = 0;
        while(n>0)
        {
            int rem =  n % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;

        }
        System.out.println("Binary to decimal of "+binNum+" = "+ bin);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        decToBin(n);
        
    }
}
