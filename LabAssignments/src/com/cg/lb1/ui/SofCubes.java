package com.cg.lb1.ui;

import java.util.Scanner;

public class SofCubes
{
	int i;
	int sum=0;
	public int cubes()
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		sum=sum+(i*i*i);
	}
		System.out.println(sum);
		s.close();
	return n;
	}
	public static void main(String args[])
	{
		SofCubes s=new SofCubes();
		s.cubes();
	}
}



