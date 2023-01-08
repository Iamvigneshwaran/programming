package programing_tamil;
import java.util.Scanner;
public class Factorial_Until_No {
	
	public static void main(String[] args){
		
	  /*
	   * given no is 5!
	   * 5! - 5! 4! 3! 2! 1!
	   *  find pannanum
	   * */	
	  Scanner noip=new Scanner(System.in);
		int fact=1;
		int no;
		System.out.println("Enter the factorial no:");
		 no=noip.nextInt();
		int i=no;
		
		while(i>0){
			fact=1;
		    while(no>0){
		       fact=fact*no;
		       no--;
	         }
		    System.out.println(fact);
		    i=i-1;
             no=i;                     	
                  
	      }
	
	}

}
