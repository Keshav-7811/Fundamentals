import java.util.Scanner;

class pelindrome{
    void ispalindrome(int num){
       int n=num;
       int rev=0,r;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(n==rev)
        System.out.println("no is pelindrome");
        else
            System.out.println("not pelindrome");
        }

        public static void main(String[] args) {
         Scanner z=new Scanner(System.in);
         System.out.println("enter your number");
         int n=z.nextInt();
         pelindrome p=new pelindrome();
         p.ispalindrome(n);
         
         }
    }
