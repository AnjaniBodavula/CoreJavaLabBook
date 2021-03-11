package com.cg.lb2.ui;

import java.util.HashSet;

public class RemoveDuplicates{
	 public static void main(String[] args) {
	  int[] ar = {1,1,2,6,4,5};
	  for(int iIterator :modifyArray(ar))
	   System.out.println(iIterator);
	 }
	 static int[] modifyArray(int[] ar) {
	  HashSet<Integer> hashSet =new HashSet<>();
	  for(int i : ar)hashSet.add(i);
	  int sz= hashSet.size();
	  int[] newar =new int[sz--];
	  for(int i:hashSet)newar[sz--]=i;
	  return newar;
	 }
	}
