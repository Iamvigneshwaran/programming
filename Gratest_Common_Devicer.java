package programing_tamil;

public class Gratest_Common_Devicer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=15;     //8-  8  4  '2' 
		int no2=42;    //10- 10 5  '2'
        int min=0;
	
        
        
        min=no1<no2?no1:no2;
        
        
        while(min>=2){
        	
		 if((no1%min==0)&&(no2%min==0))
		 {
			 int gcd=min;
			System.out.println(gcd); 
			break;
		 }
		 min--;
        }
	}
        

}
