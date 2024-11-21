import java.util.Scanner;

class Reverse {
    public void rev(int n[]) {
        int i = 0;
        int j = n.length - 1;
        while (i < j) {
            int t = n[i];
            n[i] = n[j];
            n[j] = t;
            i++;
            j--;

        }
        for (i = 0; i < n.length; i++)
            System.out.println(n[i]);

    }

    public static void main(String[] args) {
        int i, j, t, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arrey");
        size = sc.nextInt();
        int n[] = new int[size];
        System.out.println("enter " + n.length + " arrey");
        for (i = 0; i < n.length; i++)
            n[i] = sc.nextInt();
        Reverse r = new Reverse();
        r.rev(n);

    }

}
