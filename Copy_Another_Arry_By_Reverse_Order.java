package programing_tamil;

public class Copy_Another_Arry_By_Reverse_Order {

	/*  i/p    int[] a={10,20,30,40,50};
	 * 
	 * 
	 *  o/p    int[] b={50,40,30,20,10};
	 * 
	 * so first creat b array int[] b=new int[a.length];      a array length is equal to b array   
	 *      
	 *        i    j
	 *      b[0]=a[4];
	 *      b[1]=a[3];
	 *      b[2]=a[2];         REPETED ACTIVITY SO USING LOOP
	 *      b[3]=a[3];
	 *      b[4]=a[4];
	 *      
	 *      
	 *      i=0;    j=a.length-1;  //j=4
	 *      
	 *      while(i<a.length)    //a.length=5
	 *      {
	 *      b[i]=a[j]
	 *      i=i+1;
	 *      j=j-1;
	 *      }
	 * */
	
	public static void main(String[] args){
		
		int[] a={10,20,30,40,50};
		int[] b=new int[a.length];
		 
		System.out.print("Before copy b array:\n");
		for(int f=0;f<a.length;f++){
			System.out.print(b[f]+" ");
		}
		int i=0; int j=a.length-1;
		
		while(i<a.length){
	      b[i]=a[j];	
		  i++;
		  j--;
	     }
		
		//after copy reverse so b print array
		 System.out.println("\nafter reverse b array");
		for(int k=0;k<a.length;k++){
			System.out.print(b[k]+" ");
		}
		
	}
		
}
