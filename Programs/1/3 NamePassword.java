/* 7) Name length should be >=5 and should not 
contains spaces. Password length >=6 & <=10 
then display “welcome person name” otherwise 
“Invalid”
 
input1:
kumar \\name
kumar$123 \\password
output1:
welcome kumar

input2:
raj kumar
sas
output2:
Invalid

input3:
anil
anil 123
output3:
Invalid

input4:
anilchary
anil 123
output4:
welcome anilchary
 
 */


import java.util.Scanner;


public class NamePassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter a name");
		String name = sc.nextLine();
		//System.out.println("enter a password");
		String password = sc.nextLine();
		display(name, password);

	}
	static void display(String name, String password)
	{
		if(name.length()>=5 && !(name.contains(" ")) && password.length()>=6 && password.length()<=10)
		{
			System.out.println("welcome "+name);	
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	/*static boolean containsSpaces(String name)
	{
		boolean result= false;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				result = true;
				break;
			}
		}
		return result;
	}*/
}
