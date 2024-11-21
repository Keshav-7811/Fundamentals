import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner z=new Scanner(System.in);
        System.out.println("enter frist number");
        a=z.nextInt();
        System.out.println("enter second number");
        b=z.nextInt();
        System.out.println("enter third number");
        c=z.nextInt();
        sum=a+b+c;
        System.out.println("sum="+sum);


    }
}