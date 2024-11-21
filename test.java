import java.util.Scanner;
class test {
    public  int input()
    {
        System.out.println("enter your number");
        Scanner z=new Scanner(System.in);
        int x=z.nextInt();
        return x;

    }
    public int fact(int x){
        int f=1,i;
        for(i=1;i<=x;i++)
            f=f*i;
        return f;
    }
    public void show(int f)
    {
        System.out.println("factroial is="+f);

    }
public static void main(String[] args) {
    test t=new test();
    int x=t.input();
    int f=t.fact(x);
    t.show(f);
}
}
