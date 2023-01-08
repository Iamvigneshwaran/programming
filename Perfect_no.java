package programing_tamil;
import java.util.Scanner;
public class Perfect_no {

	
	public static void main(String[] args){
		
		/* eg:    28  =   1+2+4+7+14 
		 *        28  =   28
		 *       perfect no
		 * 
		 * */
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no;
		no=ip.nextInt();
		int perfect=0;
		int i=1;
	
		while(i<=no/2){
		if(no%i==0)
		{
			perfect=perfect+i;
		}
		i++;
	  }
		 if(no==perfect){
			 System.out.println("perfect");
		 }
		 else{
			 System.out.println("not perfect");
		 }
		
	}
	
}
