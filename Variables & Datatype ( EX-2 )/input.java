import java.util.Scanner;
public class input{
	public static void main(String args[]){
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a character :");
		char c=S.next().charAt(0);
		int a=c;
		System.out.println("UNICODE value :"+a);
		a=a+5;
		c=(char)a;
		System.out.println("After adding 5 :"+c);	
		        S.close();
	}
}
		