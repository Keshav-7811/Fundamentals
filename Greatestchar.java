import java.util.Scanner;
class Greatestch {
    public static void main(String[] args) {
        String str;
        Scanner z=new Scanner(System.in);
       System.out.println("enter your string");
        str=z.nextLine();
       char greatest=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
       if(str.charAt(i)>greatest)
       greatest=str.charAt(i);
       }
       System.out.println("greatest character:-"+greatest);
       
       
    }
}