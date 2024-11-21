import java.util.*;
public class P1 {
    public static void main(String []args){
        Employees e=new Employees();
        Scanner s=new Scanner(System.in);
        String empid=s.next();
        String name=s.nextLine();
        String post=s.nextLine();
        int Salary=s.nextInt();
        Employees e1=new Employees(empid,name,post,Salary);
        e.record();
        e1.record();
        Employees e2=new Employees(e);
        Employees e3=new Employees(e1);
        e2.record();
        e3.record();
    }
}
class Employees{
    private String empid,name,post;
    private int Salary;
    Employees(){
        Scanner s=new Scanner(System.in);
        empid=s.next();
        name=s.next();
        post=s.next();
        Salary=s.nextInt();
    }
    Employees(String empid,String name,String post,int Salary){
        this.empid=empid;
        this.name=name;
        this.post=post;
        this.Salary=Salary;
    }
    Employees(Employees p){
        empid=p.empid;
        name=p.name;
        post=p.post;
        Salary=p.Salary;
    }
    void record(){
        System.out.println("Employee id "+empid);
        System.out.println("Employee name "+name);
        System.out.println("Employee post "+post);
        System.out.println("Employee Salary "+Salary);
    }
}