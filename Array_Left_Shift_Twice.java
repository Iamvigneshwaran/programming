package programing_tamil;

public class Array_Left_Shift_Twice {

	
	/*   i/p - 10 20 30 40 50 
	 *   o/p - 30 40 50 10 20 
	 * 
	 *   
	 *   first copy of temp1=a[0] and temp2=a[1] so value change no problem 
	 *   last temp assign a[3] and a[4]  
	 *  
	 *      temp1=a[0]
	 *      temp2=a[1]
	 *      
	 *      a[0]=a[2]
	 *      a[1]=a[3]
	 *      a[2]=a[4]          length-1 tha index value ana namakku 2 varaikum vantha pothum 
	 *                          so length-2 ippo length 5 athula -2 poitu na 3 nama while 
	 *                          loop la < use panna 2 varaikem condition true aagum 3 vantha 
	 *                          odane fail aagum appo loop ah vittu i=3 value varum ippo arr[i]=temp1 
	 *                          nu kudutha a[3]=10 assign aagum a[i+1]=temp2 nu kudutha a[4]=20
	 *                          value assign aagum.   
	 * 
	 * */

    public static void main(String[] args){
        
    	
    	int[] arr={10,20,30,40,50};
    	
    	//before left shift twise
    	System.out.println("Before shift:");
    	for(int a=0;a<arr.length;a++){
    		System.out.print(arr[a]+" ");
    	}
    
    	int temp1=arr[0];
    	int temp2=arr[1];
    	int i=0;
    while(i<arr.length-2){	
    	arr[i]=arr[i+2];
    	  i++;
         }
    	
    //now i value is 3 so exit loop
     
     arr[i]=temp1;
     arr[i+1]=temp2;
    	
    	//all elements shifter so display the array
   	 System.out.println("\nAfter left shift Twice:");
     for(int k=0;k<arr.length;k++){
    	 
    	 System.out.print(arr[k]+" ");
     }
     	
        	
    	
    }	
	
	
}



