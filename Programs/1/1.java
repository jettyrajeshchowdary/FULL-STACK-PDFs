/*
Replace every character with a next 3rd character from a given string.

input 1:
enter a string
abcd
output1:
defg

input2:
enter a string
xza
output2:
acd


input3:
enter a string
javais
output3:
mdydlv

input4:
enter a string
language
output4:
odqjxdjh

*/

import java.util.Scanner;
class Replace
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter a string");
		String s = sc.next();
		Replace r = new Replace();
		System.out.println(r.replace(s));

	}
	
	String replace(String input) 
	{
		char ch[] = input.toCharArray();
		int n = 3;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				if(ch[i]+n>90)
					ch[i] += n-26;
				else
					ch[i] += n; 
			}
			else if(ch[i]>=97 && ch[i]<=122)
			{
				if(ch[i]+n>122)
					ch[i] += n-26;
				else
					ch[i] += n; 
			}
		}
		String s = new String(ch);
		return s;
	}

}	

