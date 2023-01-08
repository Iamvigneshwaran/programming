package programing_tamil;
import java.util.Scanner;
public class Neon_Number {

	public static void main(String[] args){
		
		/*  no = 9;
		 *   
		 *     
		 *     9=9*9=81
		 *           8+1=9
		 *       
		 *          9=9 NEON NUMBER
		 * */
		Scanner ip=new Scanner(System.in);
		int no=5,sum=0,sqr=0,digit=0;
      // System.out.println("enter the size of neon no");
		no=ip.nextInt();
       
		while(no>0){
			sqr=0;
		 sqr = no*no;
		  sum=0;
		  digit=0;
		   while(sqr>0){
			   digit=sqr%10;
			    sum=sum+digit;
			   sqr=sqr/10;
			   
		   }
		   if(sum==no)
			   System.out.println("Neon");
		   else{
			   System.out.println("not neon number");}
		   
		   no=no--;
		}
		   
		  
		
		
		
		
		
	}
	

}
