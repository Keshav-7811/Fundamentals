import java.util.Scanner;

class Perfect {
    public void perfect(int num){
        int sum=0;
        for(int i=1;i<num;i++)
        if(num%i==0)
        sum=sum+i;
        if(sum==num)
        System.out.println("number is perfect");
        else
        System.out.println("number is not perfect");


    }
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("enter your  number");
        int n=z.nextInt();
        Perfect t=new Perfect();
        t.perfect(n);
        

    }

}
