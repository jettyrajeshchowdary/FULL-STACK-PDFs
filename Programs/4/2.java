/*
2. WAP to Check Whether One String Is Rotation Of Another or not?

ip1:
java
vaja
op1:
yes

ip2:
java
avja
op2:
no

ip3:
language
guagelan
op3:
yes

ip4:
abcdef
defacb
op4:
no
*/

import java.util.Scanner;
class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
 
        if(s1.length() != s2.length())
        {
            System.out.println("no");
        }
        else
        {
             
            String s3 = s1 + s1;
 
            if(s3.contains(s2))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}

 

