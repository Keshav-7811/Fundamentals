
import java.util.Scanner;

class Sub_array1 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("enter your array size");
        int size = z.nextInt();
        int n[] = new int[size];
        System.out.println("enter your array");
        for (int i = 0; i < n.length; i++)
            n[i] = z.nextInt();
        System.out.println("enter your number");
        int num = z.nextInt();
        for (int j = 0; j < n.length; j++) {
            int sum = 0;
            for (int i = j; i < n.length; i++) {
                sum = sum + n[i];
                if (sum == num)
                    System.out.println("Sum found between indexes" + j + "and" + i);

            }

        }

    }
}
