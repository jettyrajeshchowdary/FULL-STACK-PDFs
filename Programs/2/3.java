/*
3) WAP to left rotate the elements of an array.

ip1:
5 \\size of an array
1 2 3 4 5 \\array elements
3 \\left rotate 3 elements
op1:
4 5 1 2 3

ip2:
6
10 20 30 40 50 60
2
op2:
30 40 50 60 10 20

ip3:
4
9 7 12 55
1
op3:
7 12 55 9

ip4:
3
10 5 9
2
op4:
9 10 5
*/

import java.util.Scanner;
class RotateLeft {  
    public static void main(String[] args) {  
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
        
        int r = sc.nextInt();  
         
        //Rotate the given array by r times toward left  
        for(int i = 1; i <= r; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            for(j = 1; j < arr.length; j++){  
                //Shift element of array by one  
                arr[j-1] = arr[j];  
            }  
            //First element of array will be added to the end  
            arr[j-1] = first;  
        }  
        
        //Displays resulting array after rotation  
        //System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  