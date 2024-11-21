import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("enter your string size");
        int size = z.nextInt();
        String str[] = new String[size];
        System.out.println("enter your 5 string");
        for (int i = 0; i < str.length; i++)
            str[i] = z.nextLine();
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp;
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }

        }
        for (int i = 0; i < str.length; i++)
        System.out.println(str[i]);

    }
}