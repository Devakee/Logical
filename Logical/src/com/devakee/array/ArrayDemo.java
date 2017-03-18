package com.devakee.array;

public class ArrayDemo
{

	public static void main(String[] args) 
	{
	  String[] arr = {"aa","bb", "cc"};
	  int no = printArray(arr);
	  System.out.println("Total Names : "+no);
	}
	
	public static int printArray(String[] a)
	{
		int i = 0;
        for (String string : a)
        {
			System.out.println(string);
			i++;
		}
        return i;
	}
}
