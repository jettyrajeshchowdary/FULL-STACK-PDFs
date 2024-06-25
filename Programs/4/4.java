/*
4) Rotate the each character in a given string by k letters.
for example string is abc and k=1 then resultant string will be bcd.
If the shift takes you past the end of the alphabet, just rotate 
back to the front of the alphabet.

Input1:
VirtuSa 
2
output1:
XktvwUc

input2:
ZacKraYan
1
output2:
AbdLsbZbo

ip3:
java
3
op3:
mdyd

ip4:
tcs
1
op4:
udt
*/

import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        char [] text = str.toCharArray();
	int k=in.nextInt();
        int shift =k % 26;
        for(int i = 0; i < str.length(); i++){
            if(text[i] >= 65 && text[i] <= 90){
                if(text[i] + shift > 90) text[i] += shift - 26;
                else text[i] += shift;
            }
            if(text[i] >= 97 && text[i] <= 122){
                if(text[i] + shift > 122) text[i] += shift - 26;
                else text[i] += shift;
            }
        }
        System.out.println(String.valueOf(text));
    }
}
