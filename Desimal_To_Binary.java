package programing_tamil;
import java.util.Scanner;
public class Desimal_To_Binary {
	
	 public static void main(String[] args){
		 
		 /*decimal number=4
		  * 
		  * out put will be : 1 0 0
		  * 
		  * so first 4%2=0
		  * print (0)
		  * 4/2=2
		  *  then 2%2=0
		  *  print (0)
		  * 2/2=1
		  *1%2=1
		  *  print(1)
		  *  
		  *    output: 0 0 1 this is worng ;
		  *    crt o/p is 1 0 0 
		  *    so i use string value 
		  *    eg: String binary=""
		  *    
		  *    this is act as a concatination 
		  *    
		  *    store the output+binary 
		  *    
		  *    act as: 0 
		  *            00
		  *            100
		  *  repeated activity so i use loop greater than 0
		 */ 
	 
	 
	 Scanner ip=new Scanner(System.in);
	 int no,rem;
	 String binary="";
	 
	  System.out.println("Enter the Decimal no:");
	  no=ip.nextInt();
	 while(no>0){
		 
		 rem=no%2;
		 binary=rem+binary;
		 no=no/2;
		 
	 }
	 
	 System.out.println(binary);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}
