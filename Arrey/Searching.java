import java .util.Scanner;
public class Searching {
    public static void main(String[] args) {
        int i;
        Scanner z=new Scanner(System.in);
        System.out.println("enter size of arrey");
        int size=z.nextInt();
        int n[]=new int[size];
        System.out.println("enter your"+n.length+"array");
        for( i=0;i<n.length;i++)
        n[i]=z.nextInt();
        System.out.println("enter your searching items");
        int search=z.nextInt();
        A1:
        for( i=0;i<n.length;i++){
            if(n[i]==search){
                System.out.println("search items is found");}
                break;
        
                }
                if(i==n.length)
                System.out.println("not found");
    }
    
}
