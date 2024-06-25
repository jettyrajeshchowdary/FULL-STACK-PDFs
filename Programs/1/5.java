
// Find a node with some value in a binary tree.
/*
write a method implementation of int find(Node node,int s),
it has to find wheteher the node is presemt or not.

input1:
10
20
30
40
56
40 // search
output1:
40 found

ip2:
10
20
30
89
-25
100 // search
op2:
not found

ip3:
1
2
3
4
5
3
op3:
3 found


ip4:
100
-2
56
99
258
999
op4:
not found
*/

// A binary tree node
import java.util.Scanner;
class Node {
 
    int data;
    Node left, right;
 
    Node(int d) {
        data = d;
        left = right = null;
    }
}
 
class BinaryTree {
 
    static Node head;
     
    
    static Node insert(Node node, int data) {
         

    	Node node1=new Node(data);
    	
    	
    	//System.out.println(data+ "  inserted");
                   return node1;
        
    }
 
    
    int find(Node node,int s) {
        Node current = node;
        int flag=0;
                if (current != null) {
        	if(current.data==s)
        	{
        		flag=1;
        		System.out.println(s + " found");
        		System.exit(0);
        		
        	}
            find(current.left,s);
            find(current.right,s);
            
        }
        
        return flag;
        
    }
    
     
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null;
		Scanner sc = new Scanner(System.in);
		
        root = tree.insert(root, sc.nextInt());
        root.left=insert(root, sc.nextInt());
        root.right=insert(root, sc.nextInt());
        root.left.left=insert(root, sc.nextInt());
        root.left.right=insert(root, sc.nextInt());
        
		int flag=tree.find(root,sc.nextInt());
        if(flag==0)
        	System.out.println("not found");
        
    }
} 

