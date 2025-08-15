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
	    
	    System.out.print(small(a,i));
		
	}
	
	public static boolean small(int [] a,int i ){
	    
	    if(a[i]<a[i-1]){
	        
	        return false;
	        
	    }
	    
	    if(i==a.length-1) return true;
	      
	    
	    return small(a, i+1);
	}
}
