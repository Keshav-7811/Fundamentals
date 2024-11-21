import java.util.Scanner;

public class Reverse {
    public int reverse(int num) {
        int r,n,rev=0;
        n = num;
        while (num > 0)
        {
            r = num % 10;
            rev=rev*10+r;
            num = num / 10;
        } 
        System.out.println("reverse no is="+rev);
        return 0;

    }
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("enter your number");
        int n=z.nextInt();
        Reverse t=new Reverse();
        t.reverse(n);
        
    }
}
