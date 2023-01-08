package programing_tamil;
import java.util.Scanner;
public class How_Many_Times_Elements_present {

	/* 10 20 30 20 40 
	 *  Thedura no  key=20 
	 * 
	 *  intha num la how many times then thedura no eruka illaya nu find pannaum 
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		
		int[] arr=new int[10];
		int j=0;
		System.out.println("enter the 10 no:");
	   while(j<arr.length){
		   arr[j]=d.nextInt();
		   j=j+1;
	   }	
		
		
		int key;
		System.out.println("Element to be search:");
		key=d.nextInt();
		
	      j=0;
		int count=0;
		    while(j<arr.length){
		             if(key==arr[j]){
			         count=count+1;
		               }
		            j=j+1; 
		          }
	
	   if(count>0)
		   System.out.println(key+ "is presented "+count+"times");
	   else
		   System.out.println(key+" is not presented");
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
