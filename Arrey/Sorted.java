import java.util.Scanner;

public class Sorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your arrey size");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("enter your array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        System.out.println("sorted arrey is");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }

}
