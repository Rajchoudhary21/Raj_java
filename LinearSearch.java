import java.util.Scanner;

public class LinearSearch{
    public static int search(String mobile[],String key)
    {
        int i;
        for(i = 0 ;i < mobile.length ;i++)
        {
            if(mobile[i] .equals(key))
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        String mobile[] = {"oppo","vivo","iphone","samsung"};
        System.out.print("Enter mobile name : ");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        int index = search(mobile,key);
        if(index == -1)
        {
             System.out.println("Not found");
        }
        else
        {
           System.out.println("Mobile at the index : "+ index);
        }
    }
}
