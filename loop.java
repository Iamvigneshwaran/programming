package programing_tamil;

public class loop {
	
	public static void main(String[] arg){
		
		
		loop whileloop=new loop();
		       whileloop.print10();
		       whileloop.add();
		       whileloop.squar();
		       whileloop.cube();
               whileloop.ansprint();
	}

		       	
                   void print10(){
    	           int value=5 ;
    	           while (value>0){
    	           System.out.print(value+"\t"); // 5 4 3 2 1
    	           value--;}
                         }
    		      
                   
                   void add(){
    		    	int a=1;
    		    	System.out.println();
    		      do{
    		    	  System.out.print(a*5+"\t"); //5 10 15 20
    		    	  a++;
    		        }while(a<5);   
    		       }
                   
                   
    		       void squar(){ 
    		    	   System.out.println();
    		    	   for (int a=1;a<=3;a++) 
    		    	   {
    		    	 System.out.print(a*a+"\t");// 1 4 9
    		    	   }
    		    	   }
    		       
    		       void cube(){  	 
    		    	   System.out.println();
    		       for (int a=1;a<5;a++)  
					System.out.print(a*a*a+"\t"); //1 8 27 64  		    	   
    		       }
    		       
    		       void ansprint(){
    		    	   System.out.println();
    		    	   for (int a=1;a<=121;a=a*11)
    		    	   {
    		    		  System.out.print(a+"\t");// 1 11 121
    		    		  
    		    	   }
    		       }
    	}
      
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 
    	