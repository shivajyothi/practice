package practices;


import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		System.out.println("Enter Your Name\n");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();

//if(input.isEmpty()|| input.equals(" "))
		if(StringUtils.isBlank(input))
{//flag=true;
System.out.println("enter the input");
	
	}
else {
	System.out.println("Hello World " +input + " and length of the input is"+input.length());
}
	}

}
