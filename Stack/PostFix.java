package InfixEvaluation;
import java.util.Scanner;
public class Postfix {
	static int prec(char a){
	    if(a == '+' || a == '-')
	    return 1;
	    else if(a == '*' || a=='/')
	    return 2;
	    else if(a == '^')
	    return 3;
	    else
	    return 0;
	  }
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter Infix form");
	    String a = s.next();
	    int n = a.length();
	    StackChar p = new StackChar(n);
	    int j=0;
	    char[] exp = new char[n];
	    for(int i=0;i<n;i++){
	      char x = a.charAt(i);
	      if(x == '+' || x == '-' || x == '*' || x == '/' || x =='^'){
	        if(prec(x) > prec(p.peek())){
	          p.push(x);
	        }
	        else {
	          while(prec(x) <= prec(p.peek())){
	            exp[j] = p.peek();
	            j++;
	            p.pop();
	          }
	          p.push(x);
	        }
	      }
	      else if(x == '(' || x == '[' || x == '{'){
	        p.push(x);
	      }
	      else if(x == ')'){
	        while(p.peek() != '('){
	          exp[j] = p.peek();
	          j++;
	          p.pop();
	        }
	        p.pop();
	      }
	      else if(x == ']'){
	        while(p.peek() != '['){
	          exp[j] = p.peek();
	          j++;
	          p.pop();
	        }
	        p.pop();
	      }
	      else if(x == '}'){
	        while(p.peek() != '{'){
	          exp[j] = p.peek();
	          j++;
	          p.pop();
	        }
	        p.pop();
	      }
	      else{
	        exp[j] = x;
	        j++;
	      }
	    }
	    while(p.getTop() != -1){
	      exp[j] = p.peek();
	      j++;
	      p.pop();
	    }
	    for(int k=0;k<n;k++){
	      System.out.print(exp[k]);
	    }
	    System.out.println(" ");
	  }
}
