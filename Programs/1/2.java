/* 3) 
Write a program to read n names and store in ArrayList.
Print names in forward and reverse order.

input1:
3 \\no.of names
raju babu khan \\ 3 names
names in forward order
raju
babu
khan
names in reverse order
khan
babu
raju


input2:
4
james john arnald kethy
names in forward order
james
john
arnald
kethy
names in reverse order
kethy
arnald
john
james

input3:
2
babu nani
names in forward order
babu
nani
names in reverse order
nani
babu

input4:
1
haribabu
names in forward order
haribabu
names in reverse order
haribabu
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class PrintNamesInForwardReverseOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("enter no.of names");
		int n = scanner.nextInt();
		
		List<String> names = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			//System.out.println("enter a name");
			String name=scanner.next();
			names.add(name);
		}
		print(names);

	}

	static void print(List names)
	{
		ListIterator<String> litr = names.listIterator();
		System.out.println("names in forward order");
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("names in reverse order");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}
