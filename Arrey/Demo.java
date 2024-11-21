import java .util.*;
public class Demo {
    public static void main(String[] args) {
        
    Scanner z=new Scanner(System.in);
    System.out.println("enter the size of arrey");
    int size=z.nextInt();
    int n[]=new int[size];
    System.out.println("enter your arrey number");
    for(int i=0;i<n.length;i++){
        n[i]=z.nextInt();

    }

    System.out.println("arrey is start");

    for(int i=0;i<n.length;i++){
        System.out.println(n[i]);
    }

    

    
    
 }

    }
