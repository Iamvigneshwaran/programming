package programing_tamil;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Square_Root_Givenno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
    
    System.out.println("Enter the square no:");
   // try{
    int no=input.nextInt();
   // }
   // catch(InputMismatchException inp) {
    	System.out.println("Enter only numbers");
   // }
    int i=2;
    
    while(i<=no/2){
    if(no/i==i)
    {
    	System.out.println(i+":is the square root");
    }
		i++;
    }
		
	}

}
