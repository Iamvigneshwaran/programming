package programing_tamil;

public class Array_Left_Shift {

	/* i/p - int[] arr={10,20,30,40,50}
	 * 
	 * o/p - int[] arr={20,30,40,50,10}
	 * 
	 * idea 
	 *    
	 *     first i am declare temporary variable 
	 *      
	 *      temp la a[0] store pannitu a[0] la a[1] store pannanum 
	 *      a[1] la a[2] pannanum a[2] la a[3] store pannaum a[3] la a[4] ah store pannanum
	 *      ippo a[4] la temp ah store pannanum 
	 *       
	 *        temp=a[0];                    10       20     30      40     50                                          
	 *        a[0]=a[1];                   arr[0]  arr[1]  arr[2]  arr[3]  arr[4]                             
	 *        a[1]=a[2];                                                             
	 *        a[2]=a[3];                        i=0                   
	 *        a[3]=a[4]                                     
	 *        a[4]=temp                        temp=arr[0]                         5  -1 =4     
	 *                                                                      arr.length-1  varaikum pannanum
	 *                                             i     i+1
	 *                                         arr[0]=arr[1];                             
	 *                                         arr[1]=arr[2];
	 *                                         arr[2]=arr[3]                                     
	 *                                         arr[3]=arr[4]                                      
	 *                                           
	 *                                         arr[4]=temp;  
	 *                                                                                                                     
	 *                                     20      30       40      50      10
	 *                                    arr[0]  arr[1]   arr[2] arr[3]  arr[4]                                                       
	 *                                                                                         
	 *                                                                                       
	 */
	
	
          public static void main(String[] args){
        	  
        	  
        	int[] arr={10,20,30,40,50}; int temp=0; int i=0;
        	
        	System.out.println("before left shift:");
        	  for(int k=0;k<arr.length;k++)
        	  {
        		  System.out.print(arr[k]+" ");
        	  }
        	  
        	     
        	       temp=arr[0];
        	       while(i<arr.length-1){
        	       arr[i]=arr[i+1];
        	        i++;                                       
                   }
        	       arr[4]=temp;
        	  
        	  System.out.println("\nAfter left shift:");
        	  
        	 for(int c=0;c<arr.length;c++){
                System.out.print(arr[c]+" ");	 
        		 
        	 }
        	  
       
          }	
	

	
}
