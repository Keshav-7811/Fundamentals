
import java.util.Scanner;

class Min_max {
    public static void main(String[] args) {
        int i, min, max, n[];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        n = new int[size];
        System.out.println("enter you array");
        for (i = 0; i < n.length; i++)
            n[i] = sc.nextInt();
        min = n[0];
        max = n[0];
        for (i = 1; i < n.length; i++) {
            if (n[i] < min)
                min = n[i];

            if (n[i] > max)
                max = n[i];
        }
        System.out.println("max value=" + max);
        System.out.println("min value=" + min);

    }
}