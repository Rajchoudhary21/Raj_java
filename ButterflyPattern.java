public class ButterflyPattern {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=8;i++)
        {
            for(j=1;j<=8;j++)
            {
                if((i==1 && j==1)||(i==1 && j==8)||(i==2 && j==1)||
                   (i==2 && j==7)||(i==2 && j==8)||(i==2 && j==2)||
                   (i==3 && j==1)||(i==3 && j==2)||
                   (i==3 && j==3)||(i==3 && j==6)||(i==3 && j==7)||
                   (i==3 && j==8)||(i==4 || i==5)||(i==6 && j==1)||
                   (i==6 && j==2)||(i==6 && j==3)||
                   (i==6 && j==6)||(i==6 && j==7)||(i==6 && j==8)||
                   (i==7 && j==1)||(i==7 && j==2)||(i==7 && j==7)||
                   (i==7 && j==8)||(i==8 && j==1)||(i==8 && j==8))
                {
                    System.out.print(" *");
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
