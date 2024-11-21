
import java.util.*;

class Occurance {
    public static void main(String[] args) {
        int c = 0;
        Scanner z = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = z.nextInt();
        int n[] = new int[size];
        System.out.println("enter your array ");
        for (int i = 0; i < n.length; i++)
            n[i] = z.nextInt();
        System.out.println("your array ");
        for (int i = 0; i < n.length; i++)
            System.out.println(n[i]);

        System.out.println("enter your number on which you want to occurance ");
        int k = z.nextInt();
        for (int i = 0; i < n.length; i++)
            if (n[i] == k)
                c = c + 1;
        System.out.println(c);

    }
}