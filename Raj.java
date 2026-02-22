import java.util.Scanner;

public class Raj {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first num : ");
        int a = sc.nextInt();
         System.out.print("enter second num : ");
        int b = sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("---Select operation---");
        System.out.println("press 1 for Addition...");
        System.out.println("press 2 for Subtraction...");
        System.out.println("press 3 for Multiplication...");
        System.out.println("press 4 for Division...");
        System.out.println("-------------------------");
        System.out.print("Press number : ");
        int n = sc.nextInt();
        System.out.println("-------------------------");
        
        switch(n)
        {
            case 1 : System.out.print(add(a,b));
            break;
            case 2 : System.out.print(sub(a,b));;
            break;
            case 3 : System.out.print(mul(a,b));;
            break;
            case 4 : System.out.print(div(a,b));;
            break;
            default : System.out.print("Enter only 1 to 4");
        }


    }
    
}
