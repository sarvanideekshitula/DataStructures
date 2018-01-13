public class BSTree{
  DoubleNode root = null;
  public void recursiveInsert(int x, DoubleNode head){
    DoubleNode newnode = new DoubleNode(x);
      if(head == null){
        head = newnode;
      }
      else if(x<head.data || x == head.data){
        recursiveInsert(x, head.left);
      }
      else{
        recursiveInsert(x, head.right);
      }
  }
  public void insert(int x){
    DoubleNode newnode = new DoubleNode(x);
    if(root == null){
      root = newnode;
    }
    else{
      int cnt =1;
      DoubleNode temp = root;
      while(cnt != 0){
        if(x < temp.data || x == temp.data){
          if(temp.left == null){
            temp.left = newnode;
            cnt = 0;
          }
          else
          temp = temp.left;
        }
        else{
          if(temp.right == null){
            temp.right = newnode;
            cnt = 0;
          }
          else
          temp = temp.right;
        }
      }
    }
  }
  public void inOrder(DoubleNode root){
    if(root!=null){
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }
  public void preOrder(DoubleNode root){
    if(root!=null){
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }
  public void postOrder(DoubleNode root){
    if(root!=null){
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }
  }
  public void search(DoubleNode root, int x){
    if(root == null){
      System.out.println("Not found");
    }
    else{
      if(x > root.data){
        search(root.right, x);
      }
      else if(x < root.data){
        search(root.left, x);
      }
      else{
        System.out.println("Found " + root.data);
      }
    }
  }
  public void findMin(DoubleNode root){
		if(root.left == null){
			System.out.println("Min element " + root.data);
		}
		else{
			findMin(root.left);
		}
	}
	public void findMax(DoubleNode root){
		if(root.right == null){
			System.out.println("Max element " + root.data);
		}
		else{
			findMax(root.right);
		}
	}
/*  public void successor(DoubleNode x, DoubleNode root){
    if(x.right != null){
      findMin(x.right);
    }
    else{
      int successor, cnt=1;
      while(cnt!=0){
        DoubleNode temp = root;
        if(temp == x){
          System.out.println(successor);
        }
        else if(x.data < temp.data){
            successor = temp;

        }
      }
    }
  }*/
  public int height(DoubleNode root){
    if(root == null){
      return 0;
    }
    else{
      int left = height(root.left);
      int right = height(root.right);
      if(left > right){
        return left+1;
      }
      else{
        return right+1;
      }
    }
  }
  public void levelOrder(DoubleNode root){
    QueueNode q = new QueueNode(9);
    q.enqueue(root);
    while(q.isEmpty() != 1){
      DoubleNode x = q.dequeue();
      System.out.println(x + " ");
      q.enqueue(x.left);
      q.enqueue(x.right);
    }
  }
  public static DoubleNode mirrorImages(DoubleNode l, DoubleNode r){
		if(l == null || r == null){
			return null;
		}
    System.out.println(l.data + " " + r.data);
		mirrorImages(l.left, r.right);
		mirrorImages(l.right, r.left);
	  return null;
	}
}
