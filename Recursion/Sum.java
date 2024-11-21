public class Sum {
    public static int add(int m,int c){
        if(m==0)
        return 0;

        int x=add(m-1);
        c=c+x;
        return c;
  

    }
     
   public static void main(String args[]){
    int m=4,n=0;
   int y= add(m,n);
   System.out.println(y);


   }




    
}
