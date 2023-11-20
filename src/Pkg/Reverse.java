package Pkg;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("Enter a string:");
				Scanner sc=new Scanner(System.in);
				String s=sc.next();
				String rev="";
				
				for(int i=s.length()-1;i>=0;i--)  
				{
					rev=rev+s.charAt(i); 
				}
				
				if(s.equals(rev))
				{
					System.out.println("Palindrome");
				}
				else
				{
					System.out.println("Not a Palindrome");
				}
				

			}

		


	}


