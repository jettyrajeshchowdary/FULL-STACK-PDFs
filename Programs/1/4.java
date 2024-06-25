/*
	WAP to check whether the string contains group of
	alphabets or not
	
	Input1:	
	Absd	
	output1:
	Valid
	
	Input2:
	As12d	
	output2:
	Invalid
	
	Input3:
	java1.8
	output3:
	Invalid
	
	Input4:
	java
	output4:
	Valid
*/

import java.util.Scanner;
class  Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter a string");
		String s = sc.next();
		ValidOrInvalid(s);
		}
		
		static void ValidOrInvalid(String s)
		{
			boolean valid = true;
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if( !(ch>=65 && ch<=90) && !(ch>=97 && ch<=122))
				{
					valid = false;
					break;
				}
			}
			//(or)
			
			/*for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if (!Character.isLetter(ch)) 
					valid = false;
			} */

			if(valid)
				System.out.println("valid");
			else	
				System.out.println("Invalid");
		}
}		
