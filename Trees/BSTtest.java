
public class BSTtest {

	public static void main(String[] args) {
		BSTree b1 = new BSTree();
		/*b1.recursiveInsert(100, b1.root);
		b1.recursiveInsert(50, b1.root);
		b1.recursiveInsert(75, b1.root);
		b1.recursiveInsert(300, b1.root);
		b1.recursiveInsert(250, b1.root);*/
    b1.insert(100);
		b1.insert(50);
		b1.insert(70);
		b1.insert(300);
		b1.insert(20);
		b1.insert(400);
		b1.insert(150);
		b1.insert(80);
		b1.insert(500);
		System.out.println("mirrorImages");
		b1.mirrorImages(b1.root.left, b1.root.right);
		b1.inOrder(b1.root);
		System.out.println();
		b1.preOrder(b1.root);
		System.out.println();
		b1.postOrder(b1.root);
    System.out.println();
    //b1.levelOrder(b1.root);
    //System.out.println();
    System.out.println(b1.root.data);
    System.out.println(b1.height(b1.root));
		/*b1.search(b1.root, 20);
		b1.search(b1.root, 25);
		b1.search(b1.root, 250);
		b1.findMin(b1.root);
		b1.findMax(b1.root);
		b1.delete(20);
		b1.Inorder(b1.root);
		System.out.println();
		b1.delete(75);
		b1.Inorder(b1.root);
		System.out.println();
		b1.delete(300);
		b1.Inorder(b1.root);
		System.out.println();
		b1.delete(100);
		b1.Inorder(b1.root);
		System.out.println();*/
	}

}
