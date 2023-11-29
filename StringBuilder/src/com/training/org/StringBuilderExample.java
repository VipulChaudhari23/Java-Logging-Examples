package com.training.org;

public class StringBuilderExample {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
		// StringBuilder allocates the block of 16 to store the data
//		System.out.println("Initial capacity of StringBuilder is: " + sb.capacity());
//		sb.append("JAVA ");
//		sb.append("Programming ");
//		sb.insert(5, "is ");
//		sb.append("Language");
//		System.out.println(sb);
//		System.out.println("Length of the data stored in StringBuilder is: "+ sb.length());
//		System.out.println("StringBuilder Capacity with data stored is: " +sb.capacity());
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  


//		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  


//		StringBuilder sb=new StringBuilder("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  


//		StringBuilder sb=new StringBuilder("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  


//		StringBuilder sb=new StringBuilder("Hello");  
		sb.reverse();  
		System.out.println(sb);//prints olleH 
		
		
	}
}
