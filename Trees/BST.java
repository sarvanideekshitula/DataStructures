
public class BST {
	public DoubleNode root = null;
	public void insert(int x){
		DoubleNode newnode = new DoubleNode(x);
		int cnt = 1;
		if(root == null){
			root = newnode;
		}
		else{
			DoubleNode temp = root;
			while(cnt!=0){
				if(temp.data>x || temp.data==x){
					if(temp.left==null){
						temp.left = newnode;
						cnt = 0;
					}
					else{
						temp = temp.left;
					}
				}
				else{
					if(temp.right==null){
						temp.right = newnode;
						cnt = 0;
					}
					else{
						temp = temp.right;
					}
				}
			}
		}
	}
	public void Inorder(DoubleNode root){
		if(root!=null){
			Inorder(root.left);
			System.out.print(root.data + " ");
			Inorder(root.right);
		}
	}
	public void Preorder(DoubleNode root){
		if(root!=null){
			System.out.print(root.data + " ");
			Preorder(root.left);
			Preorder(root.right);
		}
	}
	public void Postorder(DoubleNode root){
		if(root!=null){

			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data + " ");
		}
	}
	public void search(DoubleNode root, int x){
		if(root == null){
			System.out.println("Element not found");
		}
		else{
			if(root.data < x){
				search(root.left, x);
			}
			else if(root.data > x){
				search(root.right, x);
			}
			else{
				System.out.println("Element Found!");
			}
		}
	}
	public void FindMin(DoubleNode root){
		if(root.left == null){
			System.out.println("Min element " + root.data);
		}
		else{
			FindMin(root.left);
		}
	}
	public void FindMax(DoubleNode root){
		if(root.right == null){
			System.out.println("Max element " + root.data);
		}
		else{
			FindMax(root.right);
		}
	}
	public void delete(int x)
	{
		int count=1;
		DoubleNode temp=root;
		DoubleNode n=temp;
		while(count!=0)
		{
			if(temp.data==x)
			{
				count=0;
				break;
			}
			n=temp;
			if(x<temp.data)
				temp=temp.left;
			else if(temp.data<x)
				temp=temp.right;
		}
		if(temp.left == null && temp.right==null)
			n.left=null;
		else if(temp.left==null || temp.right==null)
		{
			if(n.left.data==x)
			{
				if(temp.left==null)
					n.left=temp.right;
				else
					n.left=temp.left;
			}
			else
			{
				if(temp.left==null)
					n.right=temp.right;
				else
					n.right=temp.left;
			}
		}
		else
		{
			DoubleNode temp1=temp.right;
			DoubleNode p =temp1;
			while(temp1.left!=null)
			{
				p=temp1;
				temp1=temp1.left;
			}
			if(n.right.data==x)
				n.right.data=temp1.data;
			else if(n.left.data==x )
				n.left.data=temp1.data;
			else if(n.data==x)
				n.data=temp1.data;
			if(temp1.right!=null)
					p.left=temp1.right;
			else if(temp1==p)
				temp.right=null;
			else
				p.left=null;
		}

	}
}
