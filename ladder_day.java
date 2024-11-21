import java.util.Scanner;

public class ladder_day {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter day=");
        int day=input.nextInt();
        if(day==1)
		{
		    System.out.println("monday");
		}
		else if(day==2)
		{
			System.out.println("tuesday");
		}
		else if(day==3)
		{
			System.out.println("wednesdy");
		}
		else if(day==4)
		{
			System.out.println("thrusday");
		}
		else if(day==5)
		{
			System.out.println("friday");
		}
		else if(day==6)
		{
			System.out.println("saturday");
		}
		else if(day==7)
		{
			System.out.println("sunday");
		}
		else
		{
            System.out.println("invaild day intered");
		}

    }
}
