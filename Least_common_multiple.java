package programing_tamil;
import java.util.Scanner;

public class Least_common_multiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no1,no2;   // 3- 3 6 9 12 '15' 18
         int max = 0; // 5- 5 10 '15' 20       Lcm-15
		int lcm=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter the first no:");
		no1=inp.nextInt();
		System.out.println("enter the second no:");
		no2=inp.nextInt();
		
		max=no1>no2?no1:no2;
        /* if (no1>no2)
		{
			 max=no1;
		}
		else if(no1<no2){
		max=no2;	
		} 
        */
		while(true){
		if((max%no1==0)&&(max%no2==0))
		{
			lcm=max;
		   System.out.println(lcm);
		   break;
		}
		max++;
		}
		
	}

}
