public class LargestNum {
    public static int largest(int numbers[])
    {
        int i;
        int largest = Integer.MIN_VALUE;
        int smallest  = Integer.MAX_VALUE;
        for(i=0;i<numbers.length;i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        }
        System.out.println("Minimum num : "+ smallest);
        return largest;

    }
    public static void main(String args[])
    {
        int numbers[] = {8,3,1,9,6,0,5,10};
        int max = largest(numbers);
        System.out.println("Maximum number : "+ max);


    }
    
}
