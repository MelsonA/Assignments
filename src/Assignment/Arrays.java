package Assignment;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
		//-------------------- compare two arrays
		
		
//		Scanner sc = new Scanner(System.in);
//		String n1 = sc.nextLine();
//		String n2 = sc.nextLine();
//		String[] strarr1 = n1.split(" ");
//		String[] strarr2 = n2.split(" ");
//		
//		int[] arr1 = new int[strarr1.length];
//		int[] arr2 = new int[strarr2.length];
//		
//		for(int i=0;i<strarr1.length;i++) {
//			arr1[i]=Integer.parseInt(strarr1[i]);
//		}
//		for(int i=0;i<strarr2.length;i++) {
//			arr2[i]=Integer.parseInt(strarr2[i]);
//		}
//		int l=0;
//		for(int i=0;i<strarr1.length;i++) {
//			if(arr1.length == arr2.length) {
//				if(arr1[i] == arr2[i]) {
//					l=l+1;
//				}
//			}
//		}
//		if(l==arr1.length) {
//			System.out.println("YES");
//		}
//		else {
//			System.out.println("no");
//		}
		
		//---------------------- largest array
		
//		Scanner sc = new Scanner(System.in);
//		String n = sc.nextLine();
//		String[] strarr = n.split(" ");
//		int[] arr = new int[strarr.length];
//		for(int i=0;i<strarr.length;i++) {
//			arr[i]=Integer.parseInt(strarr[i]);
//		}
//		int max=arr[0];
//		for(int i=0;i<strarr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]= {5,1,1,9,7,2,6,10};
		int n1=0;
		for(int i=0;i<arr.length;i++) {
			if(n == arr[i]) {
				n1=arr[i];
			}
		}
		if(n1==n) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
