import java.util.Scanner;

public class BinarySerach {
    public static int search(int numbers[], int n, int key)

    {    int start = 0;
        int end = n-1;
        int mid;
        while(start <= end)
        {
            mid = (start+end)/2;
            if(numbers[mid] == key)
            {
                return mid;
                
            }
            else if(numbers[mid] < key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }
        return -1;

    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int key = sc.nextInt();
        int n = numbers.length;
        int index = search(numbers, n, key);
        if(index == -1)
        {
            System.out.println("Not found");
        }
        else{
        System.out.println("number at index : "+index);
        }
    }
    
}
