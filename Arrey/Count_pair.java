
import java.util.Scanner;

class Count_pair {
    public static void main(String[] args) {
        int i, j, c = 0, value;
        Scanner z = new Scanner(System.in);
        System.out.println("enter your Size of array");
        int size = z.nextInt();
        int n[] = new int[size];
        System.out.println("enter your arraya");
        for (i = 0; i < n.length; i++)
            n[i] = z.nextInt();
        System.out.println("enter your value");
        value = z.nextInt();
        for (i = 0; i < n.length; i++)
            for (j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == value)
                    c = c + 1;
            }
        System.out.println(c);

    }
}