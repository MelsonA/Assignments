package Oops;

public class Average {
	
	public int calculate(int a,int b,int c) {
		int avg = (a+b+c)/3;
		System.out.println(avg);
		return avg;
	}
	
	public static void main(String[] args) {
		Average average = new Average();
		average.calculate(2,3,5);
	}

}
