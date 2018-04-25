package code;

import java.util.Scanner;

public class AllSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		System.out.println("请输入五个整数：");
		inputArray(a);

		// selectSort(a);
		// System.out.println("选择排序：");
		// outputArray(a);

		// bubbleSort(a);
		// System.out.println("冒泡排序：");
		// outputArray(a);

		insertSort(a);
		System.out.println("插入排序：");
		outputArray(a);

		// shellSort(a);
		// System.out.println("希尔排序：");
		// outputArray(a);

	}

	// 输入函数
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

	// 输出函数
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

	// 选择排序
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

	// 冒泡排序（复杂度:O(n2)）
	public static boolean bubbleSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		return true;

	}

	// 插入排序(复杂度：O(n2))
	public static boolean insertSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				} else {
					break;
				}
			}
		}
		return true;
	}

	// 希尔排序(复杂度：O(n1.5))
	public static boolean shellSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		int incre = a.length;
		while (true) {
			incre = incre / 2;
			for (int i = 0; i < incre; i++) {
				for (int j = i + incre; j < a.length; j += incre) {
					for (int k = j; k > i; k -= incre) {
						if (a[k] < a[k - incre]) {
							int temp = a[k - incre];
							a[k - incre] = a[k];
							a[k] = temp;
						} else {
							break;
						}
					}
				}
			}
			if (incre == 1) {
				break;
			}
		}

		return true;
	}

	// 快速排序（复杂度：O(N*logN)）
	public static boolean quickSort(int[] a, int left, int right) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		return true;
	}

	// 归并排序
	public static boolean mergeSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		return true;
	}

	// 堆排序
	public static boolean heapSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("参数出错！");
			return false;
		}

		return true;
	}

}
