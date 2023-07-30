package com.customexception;

import java.util.Scanner;

public class Product {
	
	public void productCheck(int weight)
	{
		if(weight<100)
		{
			throw new LessWeightException("Weight is less than 100");
		}
		
		else if(weight>100)
		{
			System.out.println("weight is greater than 100");
		}
		
		else
		{
			System.out.println("weight is equal to 100");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the weight of product");
		int weight=sc.nextInt();
		
		Product p=new Product();
		
		p.productCheck(weight);
	}

}
