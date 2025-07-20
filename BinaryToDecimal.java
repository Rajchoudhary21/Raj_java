import java.util.Scanner;

public class BinaryToDecimal {
    public static void binToDec(int n)
    {
        int binNum = n;
        int dec = 0;
        int pow = 0;
      
        while(n>0)
        {
            int lastDigit = n % 10 ;
            dec = dec + (lastDigit * (int)Math.pow(2 , pow)  );
            pow++;
            n = n/10;

        }
        System.out.println("Binary to Decimal of "+binNum+" = "+dec);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary Number (0,1 form) : ");
        int n = sc.nextInt();
        binToDec(n);
    }
    
}
