import java.util.Scanner;
public class InfixEvaluation {
	static int pow(int a, int b){
	    int mul=1;
	    for(int i=0;i<b;i++){
	      mul = mul* a;
	    }
	    return mul;
	  }
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter post form");
	    String a = s.nextLine();
	    int n = a.length();
	    StackInt p = new StackInt(n);
	    for(int i=0;i<n;i++){
	    	char x = a.charAt(i);
	      if(x == '+' || x == '-' || x == '*' || x == '/'){
	        if(p.getTop() == -1)
	        System.out.println("Stack is empty!");
	        else{
	          int m = p.pop();
	          int k = p.pop();
	          if(x == '+')
	        	  p.push(m+k);
	          else if(x == '-')
	        	  p.push(k-m);
	          else if(x == '*')
	        	  p.push(m*k);
	          else if(x == '/')
	        	  p.push(k/m);
	          else if(x == '^')
	        	  p.push(pow(k,m));
	          else
	        	  System.out.println("Invalid");
	        }
	      }
	      else if(x == ' '){

	      }
	      else{
	        if( a.charAt(i+1) == ' '){
	        	p.push(Integer.parseInt(String.valueOf(x)));
	        }
	        else{
	        	int f = Integer.parseInt(String.valueOf(x));
	        	while( a.charAt(i+1) != ' '){
	        		char t = a.charAt(i+1);
	        		f=f*10 + Integer.parseInt(String.valueOf(t));
	        		i++;
	        	}
	        	p.push(f);
	        }
	      }
	    }
	    System.out.println(p.peek());
	  }
}
