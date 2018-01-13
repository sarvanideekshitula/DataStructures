import java.util.Scanner;
public class StackInt {
	int[] arr = new int[5];
	 public int top = -1;
	 StackInt(){
		 arr = new int[10];
		 top = -1;
	 }
	 StackInt(int size){
		 arr = new int[size];
		 top = -1;
	 }
	 public void read(){
		 Scanner s = new Scanner(System.in);
		 while(top<arr.length){
			 top++;
			 arr[top] = s.nextInt();
		 }
	 }
	 public void print(){
		 for(int i=0;i<=top;i++){
			 System.out.println(arr[i] + " ");
		 }
	 }
	 public void push(int item){
		 if(top >= arr.length){
			 System.out.println("can't push");
		 }
		 else
		 {
			 top++;
			 arr[top] = item;
		 }
	 }
	 public int getTop(){
		 return top;
	 }
	 public int pop(){
		 if(top == -1){
			 System.out.println("Can't pop");
			 return 0;
		 }
		 else{
			 top--;
			 return arr[top];
		 }
	 }
	 public int peek(){
		 return arr[top];
	 }
	 public boolean equals(StackInt a){
		 if(this.top != a.top)
			 return false;
		 else{
			 int flag = 0;
			 for(int i=0;i<top;i++){
				 if(this.arr[i] == a.arr[i])
					 flag++;
			 }
			 if(flag == arr.length)
				 return true;
			 else
				 return false;
		 }
	 }
	 public int getMinElement(){
		 int min = arr[0];
		 for(int i=0;i<=top;i++){
			 if(arr[i]<min){
				 min = arr[i];
			 }
		 }
		 return min;
	 }
	 public void copyStack(StackInt b){
		 b.top = this.top;
		 for(int i=0;i<top;i++){
			 b.arr[i] = this.arr[i];
		 }
	 }
}
