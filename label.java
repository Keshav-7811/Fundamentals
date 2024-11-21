public class label {
    public static void main(String[] args) {
        int i, j;
        a1:
         for (i = 1; i <= 5; i++)
            for (j = 1; j <= 5; j++) {
                System.out.println("hello world");
                if (i == 3)
                    break a1;

            }
    }
}
