package programing_tamil;
import java.util.Scanner;
public class Strong_Number {
	
	
	
    public static void main(String[] args){
    	
    	
    	Scanner input=new Scanner(System.in);
    	 
    	
    	int no; int rem=0;
    	System.out.print("enter the strong no1");
    	no=input.nextInt();
        int no2=no; int sum=0;
    	
    	while(no>0){
    		
    	rem=no%10;
    		     int fact=1;
    		    while(rem>0){
    		     fact=fact*rem; 
    		     rem=rem-1;
    		    }
    		  
    		    sum=sum+fact;
    		   
    	  no=no/10;	
    	 		
    	}
    	
    	if(no2==sum)
    		System.out.println("Strong_NO");
    	else
    	   System.out.println("not_Strong_NO");
    	
    	
    	
    	
    	
    	
    }
	

	
	
	
	
}
