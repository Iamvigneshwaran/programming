package programing_tamil;
import java.util.Scanner;
public class Array_Input_two_method {
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		//first Array input method
		
		int[] no={20,30,10,30,40};
	         
		      System.out.println(no[0]);
		      
		   //so i am use looping index position 'no[i]' consider i and print and increment i=i+1  
		       int i=0;
		    while(i<no.length){
		    	System.out.print(no[i]+"\t");
		    	i=i+1;
		    }
	
		    
		//Input method
		    
		    int[] no2=new int[5];
	        int j=0;
	        
		    System.out.println("enter the array:");
		  while(j<no2.length){
			no2[j]=s.nextInt();
			System.out.print(no2[j]+"\t");
			j=j+1;
		  }  
	}

}
