/* 5) WAP to Reverse And Add A Number 
Until You Get A Palindrome.
Take number from the user, 
reverse it and add it to itself. 
If the sum is not a palindrome then 
repeat the procedure until you get a palindrome.

For example, If 7325 is input number, then
7325 (Input Number) + 5237 (Reverse Of Input Number) = 12562
12562 + 26521 = 39083
39083 + 38093 = 77176
77176 + 67177 = 144353
144353 + 353441 = 497794 (Palindrome)

In this particular case, we got a palindrome 
(497794) after 5th addition. 
 
*/

import java.util.Scanner;
public class Main {
	//Method To Reverse A Number
    
    static int reverseNumber(int number)
    {
        int reverse = 0;
         
        int rem = 0;
         
        while (number != 0)
        {
            rem = number % 10;
             
            reverse = (reverse*10) + rem;
             
            number = number/10;
        }
         
        return reverse;
    }
     
    //Method To Check For Palindrome
     
    static boolean checkPalindrome(int number)
    {
        int reverse = reverseNumber(number);
         
        if(reverse == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    //Method To Reverse And Add Given Number Until You Get A Palindrome
     
    static void reverseAndAdd(int number)
    {
        if(checkPalindrome(number))
        {
            System.out.println("Given Number is already a palindrome");
        }
        else
        {
            while (!checkPalindrome(number))
            {
                int reverse = reverseNumber(number);
                 
                int sum = number + reverse;
                 
                System.out.println(number+" + "+reverse+" = "+sum);
                 
                number = sum;
            }
        }
    }
    
    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
         
        int inputNumber = sc.nextInt();
         
        reverseAndAdd(inputNumber);
    } 
}



