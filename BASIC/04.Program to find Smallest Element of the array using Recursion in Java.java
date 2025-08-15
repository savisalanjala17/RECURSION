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
	    int min=a[0];
	    System.out.print(small(a,i,min));
		
	}
	
	public static int small(int [] a,int i , int min){
	    
	    if(i==a.length-1) {
	        return min;
	    }
	    
	    if(a[i]<min)
	      min=a[i];
	      
	    
	    return small(a, i+1 , min);
	}
}
