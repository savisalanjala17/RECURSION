import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int num= sc.nextInt();
	    int rev=0;
	    System.out.print(reverse(num,rev));
		
	}
	
	public static int reverse(int num,int rev){
	    
	    if(num==0) return rev;
	    
	    else {
	        int rem=num%10;
	        rev=rev*10+rem;
	        return reverse(num/10,rev);
	    }
	   
	}
}
