package programing_tamil;
import java.util.Scanner;
public class Printing_Square_Numbers {
     
	/*   PRINTING SQUARE NUMBERS
	 *    1      4      27      256
	 *    =      =      =        =
	 *    1       2     3        4
	 *   1       2     3        4
	 * 
	 * 
	 * IDEA - FIRST PRINT 1 TO 4;
	 * 
	 * while(i<5){
	 * System.out.print(math.pow(i,i));  -> s.o.p(math.pow(i,i));
	 * i++;
	 * }
	 * 
	 */

     public static void main(String[] args){
    	 
    	 Scanner ip=new Scanner(System.in);
    	 int no=1,i;
    	 System.out.println("Enter the size of square no:");
    	 i=ip.nextInt();
    	 while(no<i){
    		 System.out.println(Math.pow(no,no));
    		 no++;
    	 }
    	 
     }



}

