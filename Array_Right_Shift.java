package programing_tamil;

public class Array_Right_Shift {

	public static void main(String[] args){
		
		int[] arr={10,20,30,40,50};
		 
		//o/p -    50,10,20,30,40
		
		//before right shift
		System.out.println("Before right shift:");
		for(int k=0;k<arr.length;k++){
			
			System.out.print(arr[k]+" ");
		}
		
		
	              	int temp=0;
		
		        //    4=     5-1;                    
	             int  i=arr.length-1;
	             
		                                 temp=arr[i];
		
		                                 while(i>0){
		                                       arr[i]=arr[i-1];
		                                        i--;
	                                               }
		                                 arr[0]=temp;
		
		//after right shift
		  System.out.println("\nafter right shift");                               
		for(int f=0;f<arr.length;f++){
			System.out.print(arr[f]+" ");
		}
		
	}
	
	
}
