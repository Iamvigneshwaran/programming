package programing_tamil;
import java.util.Scanner;

public class Addition_of_digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
     int no;
     System.out.println("enter your no digits:");
     no=input.nextInt();
     int total=0;
     int rem=0;
     while(no>0){
     rem=no%10;
     total=total+rem;
     no=no/10;
     }
     System.out.println(total);
     
     
	}

}
