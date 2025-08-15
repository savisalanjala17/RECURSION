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
	    
	    int target=sc.nextInt();
	    
	    System.out.print(linear_search(a,i,target));
		
	}
	
	public static boolean linear_search(int [] a,int i ,int target){
	    
	    if(a[i]==target){
	        
	        return true;
	        
	    }
	    
	    if(i==a.length-1) return false;
	      
	    
	    return linear_search( a , i+1 , target);
	}
}
