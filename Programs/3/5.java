/*
 * 23)	WAP to separate zeros from non-zeros in an integer array?
 * Hint: Moving Zeros To End Of An Array :
 */

/*
ip1:
7 \\size of an array
12 0 7 0 8 0 3 \\array elements
op1:
12 7 8 3 0 0 0

ip2:
5
1 0 2 0 3
op2:
1 2 3 0 0

ip3:
6
0 0 1 5 0 7
op3:
1 5 7 0 0 0

ip4:
5
0 0 1 0 1
op4:
1 1 0 0 0
*/


import java.util.Scanner;
class Solution {

	static void moveZerosToEnd(int inputArray[])
    {
        
        int counter = 0;
  
        for (int i = 0; i < inputArray.length; i++)
        {
            
            if(inputArray[i] != 0)
            {
             
                inputArray[counter] = inputArray[i];
                counter++;
            }
        }
  
        //Assigning zero to remaining elements
  
        while (counter < inputArray.length)
        {
            inputArray[counter] = 0;
  
            counter++;
        }
  
		for (int i = 0; i < inputArray.length; i++)
			System.out.print(inputArray[i]+" ");
         
    }
  
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
		
		moveZerosToEnd(a);
		  
        

	}

}
