package com.cg.lb6.ui;
import java.util.*;
import java.util.HashMap;

public class App03 {

	public static HashMap method(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int n : array) {
			hm.put(n, n * n);
		}
		return hm;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		HashMap<Integer, Integer> hm = method(array);

		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + hm.get(key));
		}
	}
}