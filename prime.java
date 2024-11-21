//WAP in java to input any number after that print only prime digit.
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int i,num,j;
        Scanner z=new Scanner(System.in);
        System.out.println("enter your number");
        num=z.nextInt();
        for(i=1;i<=num;i++)
        {
            int c=0;
            for(j=1;j<=i;j++)
            {   
                
                if(i%j==0)
                c=c+1;
            
            }
            if(c==2)
            System.out.println(i);
        }
    }
}
