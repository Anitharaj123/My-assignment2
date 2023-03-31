package week1.day2;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		int range=6,fnum=0,snum=1;
		System.out.println(fnum);
		System.out.println(snum);			
		for (int i=1; i <= range; i++) {			
			int sum;		
			sum=fnum+snum; 
			fnum=snum;
			snum=sum;
			System.out.println(sum);
		}
	}
}



