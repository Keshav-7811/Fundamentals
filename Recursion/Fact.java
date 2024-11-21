
public  class Fact {
    public  int facto(int n){
       if(n==1 || n==0 ){
       return 1;}

       int factorial=n*facto(n-1);
       System.out.println(factorial);
       return factorial;




    }

    public static void main(String[] args) {
        Fact f=new Fact();
        int m=4;
        int n=f.facto(m);
        System.out.println(n);

    }
     


    
}
