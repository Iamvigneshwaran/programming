package programing_tamil;

public class Reverse_Array {

	/*
	 *  i/p   -   int[] arr={10,20,30,40,50};
	 *  o/p   -   int[] arr={50,40,30,20,10};
	 *
	 * Array is one time left shift
	 * 
	 *          idea 
	 *           
	 *            first temporory variable is declare
	 *              temp la a[0] value store pannaum
	 *               ippo a[0] la a[4] value va store pannanum 
	 *                a[4] la temp ah store pandran 
	 *                
	 *                intha a[0]value va temp la ukkara vachi a[0] empty panni athula a[4] ukkara vachi ippo 
	 *                 a[4] la temp ah ukkara vakkirom appo 50 namakku munnadi vanthudum 10 pinadipoidum   
	 *                  intha velaya marupadium marupadium pandrathala looping use pandrom
	 *                  equal ah eruntha  loop ah stop pandrom 
	 *                  
	 *                  
	 * */
	
	public static void main(String[] args){
		int[] arr={10,20,30,40,50};
		
		System.out.println("Before Reverse array:");
		for(int v=0;v<arr.length;v++){
			System.out.print(arr[v]+" ");
			
		}
		
		int temp=0;int j=arr.length-1;int i=0;
		
		while(i<=j){
		           temp=arr[i];
            	   arr[i]=arr[j];
		           arr[j]=temp;
		       i++;
		       j--;
	          }
		
		System.out.println("\n"+"After reverse array:");
	 for(int k=0;k<arr.length;k++){
	    System.out.print(arr[k]+" ");	
		
		
	}
	
	
	
	
	
	
	
	}
	
	
	
}
