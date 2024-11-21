public class Varargs {
    public void sum(int...x) {
        int s=0;
        for(int i:x)
        s=s+i;
        System.out.println("sum="+s);
    }
    public static void main(String[] args) {
        Varargs t=new Varargs();
        t.sum(10);
        t.sum(10,20);
        t.sum(10,20,30,40);
    }
}
