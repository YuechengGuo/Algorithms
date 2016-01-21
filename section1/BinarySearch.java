package section1;

import java.util.*;

public class BinarySearch {
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return hi;
	}
	
	public static void main(String[] args) {
		int[] numList = {1, 2, 4, 1, 2, 6, 7, 8};
		int key = numList[0];
		Arrays.sort(numList);
		display(numList);
		int index = rank(key, numList);
		if (index != -1) {
			System.out.println(index);
		}
		
	}
	
	private static void display(int[] list){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			 arrList.add(list[i]);
		}
		System.out.println(arrList);
	}
}
