package com.devakee.array;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class Patter1 
{
	 public static void main(String[] args)
		{
			String input="Welcome to Java Session Java Session Session Java"; 		//Input String	
			String[] words=input.split(" ");	//Split the word from String
			for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
			{
				if(words[i]!=null)
				{
				
				for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
				{
					
				if(words[i].equals(words[j]))	//Checking for both strings are equal
					{
						words[j]=null;			//Delete the duplicate words
					}
				}
				}
			}
			for(String name : words)		//Displaying the String without duplicate words	
			{
				if(name!=null)
				{
					System.out.println(name);
				}
				
		     }  
		
	
	

		}  
}
	
 
	   
	

