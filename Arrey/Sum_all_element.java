import java.util.Scanner;
public class Sum_all_element
{
    public static void main(String[] args) {
        int i,size,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arrey");
        size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("enter your "+n.length+" size arrey");
        for(i=0;i<size;i++)
        n[i]=sc.nextInt();
        System.out.println("\n"); 
        for(i=0;i<n.length;i++){
        System.out.println(n[i]);
        sum=sum+n[i];
        }
        System.out.println("sum="+sum);


    }
    
}

    
