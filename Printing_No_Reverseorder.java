package programing_tamil;

import java.util.Scanner;

public class Printing_No_Reverseorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner inputno=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=inputno.nextInt();
	
		while(no>0){
       int rem=no%10;
        System.out.print(rem+"\t");
       no= no/10;
		}
       
	}

}
