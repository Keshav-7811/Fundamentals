import java.util.Scanner;

class Negative {
    public static void main(String[] args) {
        int temp;
        Scanner z = new Scanner(System.in);
        System.out.println("enter your array size");
        int size = z.nextInt();
        int n[] = new int[size];
        System.out.println("enter your array");
        for (int i = 0; i < n.length; i++)
            n[i] = z.nextInt();

        for (int i = 1; i < n.length; i++) {
            if (n[i] < 0)
                if (n[i - 1] > 0) {
                    temp = n[i];
                    n[i] = n[i - 1];
                    n[i - 1] = temp;
                    for (int j = i - 1; j > 0; j--) {
                        if (n[j] < 0 && n[j - 1] > 0) {
                            temp = n[j];
                            n[j] = n[j - 1];
                            n[j - 1] = temp;
                        }
                    }
                }

        }
        System.out.println();
        for (int i = 0; i < n.length; i++)
            System.out.println(n[i]);

    }
}