/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
import java.util.*;
public class Bill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();
        float add = (pencil + pen + eraser);
        float gst = (add*18)/100;
        float bill = add + gst;
        System.out.println("total cost : "+ add);
        System.out.println("gst 18% : "+ gst);
        System.out.println(" total Bill : "+ bill);
    }
}