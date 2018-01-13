import java.util.Scanner;

public class String {
	char[] a = new char[10];
	public int top = -1;
	String(){
		 a = new char[10];
		 top = -1;
	 }
	 String(int size){
		 a = new char[size];
		 top = -1;
	 }
	 public void print(){
		 for(int i=0;i<=top;i++){
			 System.out.println(a[i] + " ");
		 }
	 }
	 public void push(char item){
		 if(top >= a.length){
			 System.out.println("can't push");
		 }
		 else
		 {
			 top++;
			 a[top] = item;
		 }
	 }
	 public int pop(){
		 if(top == -1){
			 System.out.println("Can't pop");
			 return 0;
		 }
		 else{
			 top--;
			 return a[top];
		 }
	 }
	 public void reverse(){
		for(int i=top;i>-1;i++){
			System.out.println(a[i]);
		}
	 }
}
