package Assignment;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("enter");
//		String arr = input.nextLine();
//		String[] strarr = arr.split(" ");
//		
//		int[] intarr = new int[strarr.length];
//		
//		for (int i=0;i<strarr.length;i++) {
//			intarr[i]=Integer.parseInt(strarr[i]);
//		}
//		
//		int max=intarr[0]; 
//		
//		for(int i=1;i<intarr.length;i++) {
//			if(intarr[i]>max) {
//				max=intarr[i];
//			}
//		}
//	    
//		System.out.println(max);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int l = sc.nextInt();
	    
		for(int i=0;i<=l;i++) {
			int n=i*l;
			System.out.println(n);
		}
	}	

}
