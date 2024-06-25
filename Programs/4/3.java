/*
3. WAP To Check Whether Two Strings Are Anagram Or Not?

ip1:
keEp
peeK
op1:
anagrams

ip2:
SiLeNt CAT
LisTen AcT
op2
anagrams

ip3:
Mother In Law
Hitler Woman
op3:
anagrams

ip4:
joy
enjoy
op4:
not anagrams
 */

import java.util.Arrays;
import java.util.Scanner;
class Solution {

	static void isAnagram(String s1, String s2)
    { 
		String copyOfs1 = s1.replaceAll("\\s", "");
		 
        String copyOfs2 = s2.replaceAll("\\s", "");
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
 
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        if(status)
        {
            System.out.println("anagrams");
        }
        else
        {
            System.out.println("not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		isAnagram(s1,s2);
        
    }
}
