import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int num= sc.nextInt();
	    int i=2;
	    System.out.print(prime(num,i));
		
	}
	
	public static boolean prime(int num,int i){
	    
	    if(num<=2) {
	        return(num==2 ?  true :  false);
	    }
	    
	    if(num%i==0 && i!=num)
	      return false;
	      
	    if(i*i > num) return true;
	    
	    else return prime(num,i+1);
	}
}
