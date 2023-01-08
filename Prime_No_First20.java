package programing_tamil;

public class Prime_No_First20 {
	
	 public static void main(String[] args){
		 
		 
		 int count=0;
		 System.out.println(2+"prime");
		 count=count+1;
		 
	 
	 int no=3;
	 while(count<=20){
	 boolean prime=true;
		 int i=2;
		  while(i<no)
		  {
			  if(no%i==0){
				  System.out.println(no+"not prime");
				  prime=false;
			  }
			  i++;
		  }
			  if(prime==true)	{		 
			  System.out.println(no+"prime");
				  count=count+1;
			  }
		   no=no+2;	 	  
	   }
     }	 
}	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		                            /*   1ST 20 PRIME NUMBERS
		                             *     
		                             *     IDEA :EVEN NO IS NOT PRIME SO I AM PRINT ONLY ADD NO
		                             *     
		                             *      2 3 5 7 9 11 13 15 17 19 21 
		                             *      
		                             *  -    NEXT CHECK THE  ODD NO PRIME OR NOT
		                             *        first check no 3:
		                             *        i=2; boolean prime=true;
		                             *        no=3;
		                             *        while(i<no){
		                             *         if(no%i==o)
		                             *         S.o.p("not prime");
		                             *         i++;
		                             *         }
		                             *         if(prime==true){
		                             *         S.o.p(prime);
		                             *         }
		                             *         
		                             *         
		                             *   -  I AM CHECK ODD NO SO (NO+2) INCREMENTED NO IS CHANGE 
		                             *        TO 3 5 7 . . .
		                             *         SO I AM USE ANOTHER WHILE LOOP
		                             *                     and
		                             *          I HAVE 2O PRIME NO SO I IMPLEMENTED COUNT
		                             *              COUNT IS INCREMENTED IN PRIME CONDITION 
		                             *         
		                             *         
		                             *        i=2; boolean prime=true;
		                             *        count=o;
		                             *        S.o.p(2);
		                             *        count=count+1;
		                             *        NO=3
		                             *        while(COUNT<20)
		                             *        {
		                             *              while(i<no){
		                             *                  if(no%i==o)
		                             *                    S.o.p("not prime");
		                             *                      i++;
		                             *                      }
		                             *                  if(prime==true){
		                             *                     S.o.p(prime);
		                             *                      count=count+1;
		                             *                       } 
		                             *         no=no+2;
		                             *         }   
		   
		                             * */
		  