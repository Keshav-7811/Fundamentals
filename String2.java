import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
    Scanner z=new Scanner (System.in);
    System.out.println("enter your String");
    String str[]=new String[5];
    for(int i=0;i<5;i++)
     str[i]=z.nextLine();
     for(int i=0;i<5;i++)
     System.out.println(str[i]);

    
}
}