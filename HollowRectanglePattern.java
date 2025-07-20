public class HollowRectanglePattern {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int l;
        for(i=1;i<=4;i++)
        {
          
            for(k=1;k<=4;k++)
            {
                if((i==1 || i==4 )||(i==2 && k==1)||(i==2 && k==4)||(i==3 && k==1)||(i==3 && k==4) )
                {
                System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
        }
            System.out.println();
           
        }
        
        }
        

    }
