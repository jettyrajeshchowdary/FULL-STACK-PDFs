/*
12_3) WAP to find rank an array according to values of the array.

ip1:
3 \\size of an array
5 1 4 \\array elements
op1:
1 3 2

ip2:
5
87 22 56 45 101
op2:
2 5 3 4 1

ip3:
3
10 10 10
op3:
1 1 1

ip4:
4
10 20 10 5
op4:
2 1 2 4

*/

import java.util.Scanner;
class Solution {
    public static void main(String[] args) 
    { 
    	int n,i,j,a[],b[],count=0;
    	Scanner sc = new Scanner(System.in);
    	//System.out.println("enter the size of an array");
    	n = sc.nextInt();
    	a = new int[n];
    	b = new int[n];
    	
    	//System.out.println("enter the nos");
    	for(i=0;i<n;i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	for(i=0;i<n;i++)
    	{
    		count=0;
    		for(j=0;j<n;j++)
    		{
    			if(a[j]>a[i])
    			{
    				count++;
    			}
    		}
    		b[i]=count+1;
    	}
    	
    	//System.out.println("rank of an array is");
    	for(i=0;i<n;i++)
    	{
    		System.out.print(b[i]+" ");
    	}
    } 
}



