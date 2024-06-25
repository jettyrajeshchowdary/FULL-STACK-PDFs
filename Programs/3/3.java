/*
9)	WAP to display repeated no’s in an array, in ascending order 
(no. can be repeated any No.of times)

ip1:
10 \\size of an array
10 2 10 10 5 2 3 9 88 1 \\array elements
op1:
2 10

ip2:
5
9 8 9 1 8
op2:
8 9

ip3:
6
2 2 2 2 2 1
op3:
2

ip4:
4
9 8 9 3
op4:
9
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
		  
		  int c=0;
		  for(i=0;i<n;i++)
		  {
			  c=1;
			  for(j=i+1;j<n;j++)
			  {
				  if(a[i]==a[j] && a[i]!=-1)
				  {
					  c++;
					  a[j]=-1;
				  }
			  }
			  
			  if(c>1)
				System.out.print(a[i]+" ");
			
		  }
		  
	}
		
	
}





