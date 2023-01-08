package programing_tamil;
import java.util.Scanner;
public class Binary_To_Decimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  1        0         1       - 5
		 *  *        *         * 
		 *  2^2     2^1       2^0
		 *  ||       ||        || 
		 *   4        0         1       -5      
		 *
		 * Step 1: binary no break eg: 1 0 /1
		 *         101%10 --> 1
		 * 
		 * step 2: no is 101 so break the no 
		 *          101/10 --> 1
		 *          now no is 10
		 *           
		 * Step 3: no 10 is  1 /0
		 *         no%10 --> 0
		 *         
		 * Step 4: no is 10 break the no
		 *           10/10--> 1
		 *        
		 * Step 5: no is now  /1                                     
		 *        1%10 --> 1
		 *        
		 * step 6: no 1/10= O so contion falls        
		 * 
		 * 
		 * decimal = decimal+(rem*math.pow(2,i))
		 *   i is incremented +1
		 * 
		 * 
		 * 
		 * */
		Scanner ip=new Scanner(System.in);
		 
		int decimal=0;
		int rem=0,i=0;
		int no;
		System.out.println("Enter the binary number:");
		no=ip.nextInt();
	
	while(no>0){
		rem=no%10;
		decimal=(int)(decimal+(rem*Math.pow(2,i)));
		no=no/10;
		i++;
	}
	System.out.println(decimal);

	}

}
