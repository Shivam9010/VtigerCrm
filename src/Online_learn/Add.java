package Online_learn;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		int a, b,c;
		System.out.println("Enter any two Number:");  // console me add karna 
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
	    b=s.nextInt();
	    c=a+b;
	    System.out.println("Sum of Two Number:"+c);
	    my();
	}
	public static void my() {               // Console me into karna;
		int a,b,c,d;
		System.out.println("Enter any three Number:");
		Scanner e=new Scanner(System.in);
        a=e.nextInt();
        b=e.nextInt();
        c=e.nextInt();
        d=a*b*c;
        System.out.println(d);
        
        if(d==1000) {                    // Condition
        	System.out.println("go to");
        }
		
	}

}
