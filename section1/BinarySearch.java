package section1;

import java.util.*;

public class BinarySearch {
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = 0;
		return hi;
	}
	
	public static void main(String[] args) {
		int[] numList = {1, 2, 4, 1, 2, 6, 7, 8};
		int key = 5;
		Arrays.sort(numList);
		display(numList);		
		
	}
	
	private static void display(int[] list){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			 arrList.add(list[i]);
		}
		System.out.println(arrList);
	}
}
