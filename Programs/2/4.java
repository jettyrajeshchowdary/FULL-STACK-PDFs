/* 4. WAP to find maximum repeated character in a word

input1: praveen
output1: max repeated character = e

ip2: language
op2: max repeated character = a

ip3: jaja
op3: max repeated character = j

ip4: independent
op4: max repeated character = n


*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


class MaxRepeatedCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter a line");
		String s=sc.next();
		
		calculate(s);

	}

	static void calculate(String s)
	{
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, (map.get(ch))+1);
			}
			else
			{
				map.put(ch, 1);
			}
				
				
		}
		//System.out.println(map);
		int max=0;
		char ch=' ';
		
		for(Map.Entry<Character,Integer> m : map.entrySet())
		{
			if(m.getValue()>max)
			{
				 ch = m.getKey();
				 max=m.getValue();
			}
		}
		System.out.println("max repeated character = "+ch);
	}
}
