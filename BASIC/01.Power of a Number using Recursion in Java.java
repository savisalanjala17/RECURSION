import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int num= sc.nextInt();
	    int pow=sc.nextInt();
	    System.out.print(power(num,pow));
		
	}
	
	public static int power(int num,int pow){
	    
	    if(pow==0) return 1;
	    
	    else return num*power(num,pow-1);
	}
}
