import java.util.Scanner;

class Dublicate {
    public static void main(String[] args) {
        int i, j, z, n[];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your arrey size");
        int size = sc.nextInt();
        n = new int[size];
        System.out.println("enter your array");
        for (i = 0; i < n.length; i++)
            n[i] = sc.nextInt();

        for (i = 0; i < n.length; i++) {
            for (j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    for (z = i + 1; z < n.length; z++)
                        n[z - 1] = n[z];
                }
                for (z = i + 1; z < n.length; z++)
                    System.out.println(n[z]);

            }
        }

    }
}
