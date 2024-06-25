/*
1. WAP to find Longest Word

input1: java is an oop language
output1: longest word=language

ip2: bat cat mat
op2: longest word=bat

ip3: 12 java1.8 java
op3: longest word=java1.8

ip4: java is an platform_independent language
op4: longest word=platform_independent


*/

import java.util.Scanner;
class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String words[]=s.split(" ");
		int maxLength = 0,j=0;
		for(int i=0;i<words.length;i++)
		{
			if(maxLength<words[i].length())
			{
				maxLength = words[i].length();
				j=i;
				//System.out.println("longest word="+words[j]);
			}
			//System.out.println("a");
		}
		System.out.println("longest word="+words[j]);
		

	}

}
