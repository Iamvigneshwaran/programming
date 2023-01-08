package programing_tamil;
import java.util.Scanner;
public class Addition_Of_Digits_Until_IT_Becomes_Single_Digits {

	
	public static void main(String[] args){

	Scanner ip=new Scanner(System.in);
	int no;
	
	System.out.println("Enter the NUmber:");
	no=ip.nextInt();
	int total=no;
	
	 while(total>9){
	      no=total;
	             total=0;
            	int rem=0;
              while(no>0)
              {
    	        rem=no%10;
    	      total=total+rem;
    	        no=no/10;  	  
               }	
	         }
      System.out.println(total);
	 
	 
	}
}	