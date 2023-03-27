package Online_learn;
import java.util.Scanner;

public class If_Condition {
	public static void main(String[] args) {
		
		vote();
		
		int pwd;
		System.out.println("Enter Password:=");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==3000) {
			System.out.println("My name:=Shivam");
			System.out.println("My age:=22");
			System.out.println("My Address:=Mondh Bhadohi");
		}
		else {
			System.out.println("Sorry! Wrong Password...");
		}
		
	}		
	public static void vote() {
		int vote; 
		System.out.println("Enter your age:=");
		
		Scanner obj=new Scanner(System.in);
		vote=obj.nextInt();
		
		if(vote>18) {
			System.out.println("Are you ellegeble for voting");
			
		}
		else if(vote<18) {
			System.out.println("Sorry not ellegeble");
		}
	}
}
