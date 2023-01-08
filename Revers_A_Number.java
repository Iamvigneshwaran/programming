package programing_tamil;
import java.util.Scanner;
public class Revers_A_Number {
	
	public static void main(String[] args){
		 
	/* REVERS A NUMBER - DIGIT VALUE (ie:10)
	 * 
	 * EG: no= 1 2 3 4
	 * 
	 * output will be 4 3 2 1 
	 * 
	 * idea- 1234%10  -> 4
	 *       1234/10  -> 123   integer value so . value terminates
	 *       123%10   -> 3
	 *       123/10   -> 12
	 *       12%10    -> 2
	 *       12/10    -> 1
	 *       1%10     -> 1
	 *                                   
	 *                                   while(no>0){
	 *       4=(0*10)+4                  rem=(rem*10)+no%10;
	 *         43=(4*10)+3                     no=no/10;
	 *          432=(43*10)+2                     }
	 *            4321 =(432*10)+1
	 * 
	*/
		
		Scanner ip=new Scanner(System.in);
		int no;
		System.out.println("Enter the number:");
		no=ip.nextInt();
		int rem=0;
		 
		while(no>0){
		rem=(rem*10)+no%10;
		    no=no/10;
		   if(rem==no)
			   System.out.println("Palindrome");
		}
		System.out.println(rem);
		
	}

}
