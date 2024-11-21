import java.util.Scanner;

class Missing_number {
    public static void main(String[] args) {
        int i, count = 1;
        Scanner z = new Scanner(System.in);
        System.out.println("enter your array size");
        int size = z.nextInt();
        int n[] = new int[size];
        System.out.println("enter your array");
        for (i = 0; i < n.length; i++)
            n[i] = z.nextInt();
        System.out.println();
        for (i = 0; i < n.length; i++) {
            if (n[i] == count) {
                count++;
            } else {
                System.out.println(n[i] - 1);
                break;
            }
        }

    }
}