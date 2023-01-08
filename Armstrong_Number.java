package programing_tamil;

public class Armstrong_Number {

	
	public static void main(String[] args){
		
		
		/*
		 * 153 - (1*1*1)+(5*5*5)+(3*3*3)
		 * 153 - 153 It is armstrong number
		 * 
		 * */
		int no=153; int armstrong_no=0;
         int rem=0;int no2=no;
		while(no>0){
			rem=no%10;
		  armstrong_no=armstrong_no+(rem*rem*rem);
		  no=no/10;
		}
	     if(no2==armstrong_no){
	    	 System.out.print("Armstrong_No");
	     }
	     else{
	    	System.out.println("Not_Armstrong_No"); 
	     }
		
	}
}
