import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b,c,average;
        System.out.println("enter three numbers:-");
        a=z.nextInt();
        b=z.nextInt();
        c=z.nextInt();
        average=(a+b+c)/3;
        System.out.println("average is:-"+average);
    }
}
