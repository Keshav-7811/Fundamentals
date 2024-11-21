import java.util.Scanner;

class First_repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size of array");
        int size = sc.nextInt();
        int n[] = new int[size];
        System.out.println("enter your array");
        for (int i = 0; i < n.length; i++)
            n[i] = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n.length; i++)
            System.out.println(n[i]);

        A1: for (int i = 0; i < n.length; i++)
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    System.out.println(n[i]);
                    break A1;
                }
            }

    }
}