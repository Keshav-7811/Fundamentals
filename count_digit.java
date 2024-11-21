import java.util.Scanner;
class count_digit {
  public int digit(int num){
    if(num==0){
      return 1;
    }
     int c=0;
  while(num>0){
    c=c+1;
    num=num/10;
  }
  return c;
  }

public static void main(String[] args) {
Scanner z=new Scanner(System.in);
System.out.println("enter your number");
int n=z.nextInt();
count_digit t=new count_digit();
int c=t.digit(n);
System.out.println("total digit is="+c);
}
}
