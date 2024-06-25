/*
 * 5. If a word in a given sentence is palindrome then enclose within the $ 
 * otherwise reverse the word in a given sentence
 * 
 * I/P1: aba
 * O/P1: $aba$
 * 
 * I/P2: axtp mmbty aeio
 * O/P2: ptxa ytbmm oiea
 * 
 * I/P3: mam madam
 * O/P3: $mam$ $madam$
 * 
 * I/P4: refer man
 * O/P4: $refer$ nam
 * 
 */


import java.util.Scanner;

public class Solution {
	static int isPalindrome(String temp)
	   {
		   String temp2=temp;
		   StringBuffer sbf=new StringBuffer(temp2);
		   sbf.reverse();
		   String temp3=sbf.toString();
		   if(temp3.equals(temp))
			   return 1;
		   else
			   return 0;
	   }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	String str=sc.nextLine();
	    	String arr[]=str.split(" ");
	    	String res="";
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		int x=isPalindrome(arr[i]);
	    		if(x==1)
	    			res=res+"$"+arr[i]+"$"+" ";
	    		else
	    		{
	    			 String temp2=arr[i];
	    			   StringBuffer sbf=new StringBuffer(temp2);
	    			   sbf.reverse();
	    			   String temp3=sbf.toString();
	    			   if(i!=arr.length-1)
	    			   res=res+temp3+" ";
	    			   else
	    				   res=res+temp3;
	    		}
	    	}
	    	System.out.println(res);
	    	sc.close();
	       
	    }
	}
	