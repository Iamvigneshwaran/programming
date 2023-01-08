package programing_tamil;

public class Fibonacci_series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f=0;
		int s=1;
		int t;
		for (int i=0;i<=8;i++){
		System.out.println("first"+f);
		t=f+s;
		f=s;
		s=t;
		}
	}

}
