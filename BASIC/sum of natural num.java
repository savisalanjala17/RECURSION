import java.util.*;

class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(sumof(n));
     
     
    }
    
    public static int sumof(int n){
        if(n==1) return 1;
        
        else return n+sumof(n-1);
    }
    
    
    
    
}
