package code;

//选择排序
import java.util.Scanner;

class Sort0407 {

	public static boolean selectSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("数组有误！");
			return false;
		}

		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[index]) {
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

	public static boolean soupSort(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("数组输入错误!");
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		System.out.println("请输入五个整数：");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		selectSort(a);
		System.out.println("选择排序");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

		soupSort(a);
		System.out.println("冒泡排序");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		sc.close();

	}

}
