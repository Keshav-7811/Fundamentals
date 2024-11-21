import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        int i,size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arrey");
        size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("enter your "+n.length+" size arrey");
        for(i=0;i<n.length;i++)
        n[i]=sc.nextInt(); 
        for(i=0;i<n.length;i++)
        System.out.println("your arrey is"+n[i]);

    }
    
}
