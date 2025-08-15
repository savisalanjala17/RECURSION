import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int array_size= sc.nextInt();
	    int i=1;
	    int a[] = new int [array_size];
	    for(int ind=0;ind<array_size;ind++){
	        a[ind]=sc.nextInt();
	    }
	    int max=a[0];
	    System.out.print(large(a,i,max));
		
	}
	
	public static int large(int [] a,int i , int max){
	    
	    if(i==a.length-1) {
	        return max;
	    }
	    
	    if(a[i]>max)
	      max=a[i];
	      
	    
	    return large(a, i+1 , max);
	}
}
