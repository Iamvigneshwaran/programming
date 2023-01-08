package programing_tamil;
import java.util.*;

public class Prime_No {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputno=new Scanner(System.in);
		int no;
		int i=2;
		boolean prime=true;
		System.out.print("enter the no");
		no=inputno.nextInt();
		while(i<no){
			
			if(no%i==0)
		System.out.println("given no is not prime");
			prime=false;
		     i++;
		}
		if(prime==true)
			System.out.println("Given no is prime");
			
		
		

	}

}
