package programing_tamil;
import java.util.Scanner;

public class No_Of_digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		int no;
		System.out.println("enter the number:");
		no=number.nextInt();
		int count=0;
		while(no>0){
		no=no/10;	
			count++;
		}
		System.out.println(count);

	}

}
