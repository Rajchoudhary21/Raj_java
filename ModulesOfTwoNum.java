//Wap to find modules of two numbers
import java.util.*;
public class ModulesOfTwoNum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = a%b;
        System.out.println("Modules = "+ mod);
    }
    
}

