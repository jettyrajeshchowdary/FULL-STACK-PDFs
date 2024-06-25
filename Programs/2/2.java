/*
2) WAP to find the frequency of each element in the array

Input1:
9 \\size of an array
1 2 8 3 2 2 2 5 1 \\array elements
Output:
1 repeated 2 times
2 repeated 4 times
8 repeated 1 times
3 repeated 1 times
5 repeated 1 times

ip2:
5
6 1 3 2 1
op2:
6 repeated 1 times
1 repeated 2 times
3 repeated 1 times
2 repeated 1 times

ip3:
2
9 7
op3:
9 repeated 1 times
7 repeated 1 times

ip4:
1
5
op4:
5 repeated 1 times
*/

import java.util.Scanner;
class Frequency {  
    public static void main(String[] args) {  
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
         
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    arr[j] = -1;  
                }  
            }  
            if(arr[i] != -1)  
                System.out.println(arr[i] +" repeated "+count +" times");  
        }  
  
          
    }
}  

