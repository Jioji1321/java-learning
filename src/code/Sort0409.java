package code;

import java.util.Scanner;

public class Sort0409 {

	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("请输入五个整数：");
		inputArray(a);
		
		selectSort(a);
		System.out.println("选择排序：");
		outputArray(a);
		
//		int[] b = new int[5];
//		System.out.println("请输入五个整数：");
//		inputArray(b);
		
//		bubbleSort(b);
//		System.out.println("冒泡排序：");
//		outputArray(b);
		
	}

	public static boolean inputArray(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		return true;
	}

	public static boolean outputArray(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		return true;
	}

	public static boolean selectSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[index] < a[j]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = a[index];
				a[index] = a[i];
				a[i] = temp;
			}
		}
		return true;
	}

	public static boolean bubbleSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}
		
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > 0; j--) {
				if(a[j]<a[j-1]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					flag = false;
				}
			}
			if(flag) {
				break;
			}
		}
		return true;

	}

}
