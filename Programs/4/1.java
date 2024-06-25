/*
  1. WAP to Reverse Each Word Of A String

ip1:
java language
op1:
avaj egaugnal

ip2:
java is an oop
op2:
avaj si na poo

ip3:
msoffice
op3:
eciffosm

ip4:
c cpp java .net
op4:
c ppc avaj ten.
*/  
 

import java.util.Scanner;
class Solution
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
          
        System.out.println(reverseString);
        
    }
     
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
        reverseEachWordOfString(s);
    }
}

