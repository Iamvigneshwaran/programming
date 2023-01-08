package programing_tamil;
import java.util.Scanner;

public class Factorial {
	
	 public static void main(String[] args){
		 
		 
		                   /*5 - 5*4*3*2*1  =120
		                    *    ___
		                    *     20
		                    *     ____
		                    *     20*3
		                    *        60*2
		                    *        ____
		                    *          120*1
		                    *          _____
		                    *               120    
		                    *  */
		 Scanner inp=new Scanner(System.in);
		 int no;
		 System.out.println("Enter the factorial number:");
		 no=inp.nextInt();
		int fact=no;
		 
		 while(no>1){
		      no--;
		     fact=fact*no;                  
		 }
	         System.out.println(fact);
	 
	 
	 
	 
	 
	 }

}
