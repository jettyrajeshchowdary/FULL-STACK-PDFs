/*
2)	WAP to display unique no’s in an array, in ascending order
(no. can be repeated any No.of times)

ip1:
10 \\size of an array
10 2 10 10 5 2 3 9 88 1 \\array elements
op1:
1 2 3 5 9 10 88

ip2:
6
20 10 20 20 1 10
op2:
1 10 20

ip3:
5
2 2 2 2 2
op3:
2

ip4:
7
10 2 4 10 7 10 10
op4:
2 4 7 10
*/

import java.util.Scanner;
class Solution {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,temp;
		//System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		 for(i=0;i<n;i++)
		  {
		    
		     for(j=i+1;j<n;j++)
		    {
		       if(a[i]>a[j])
		       {
		          temp=a[i] ;
		          a[i] =a[j];
		          a[j] =temp;
		       }
		    }
		    
		  }
		  
		  for(i=0;i<n-1;i++)
		  {
		    if(a[i]!=a[i+1])
		      System.out.print(a[i]+" ");
		  }
		  System.out.print(a[i]);

	}
		
	
}





