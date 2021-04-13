package regexuserresistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserResistration {
	
	public static void main(String[] args) {
		// use case 1
		System.out.println("enter a valid name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String regex = "^[a-z]{3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		boolean b = matcher.matches();
		
		if(matcher.matches()) {
			System.out.println("name is valid");
		}
		else {
			System.out.println("name is not  a valid");
		}
		
		// use case 2
		System.out.println("enter a last valid name");
		String lastname = sc.nextLine();
		String reg = "^[a-z]{3}";
		Pattern pa = Pattern.compile(reg);
		Matcher ma = pa.matcher(lastname);
		boolean bo = ma.matches();
		
		if(ma.matches()) {
			System.out.println("valid");
		}else {
		System.out.println("not valid");
		}
		
		// use case 3
		System.out.println("enter your valid email :");
		String email = sc.nextLine();
		String re = "[a-z]{3}.[a-z]{3}@[a-z]{2}.[a-z]{2}.[a-z]{2}";
		
		Pattern pa1 = Pattern.compile(re);
		Matcher mat = pa1.matcher(email);
		boolean bol = mat.matches();
		
		if(mat.matches()) {
			System.out.println("valid email address");
		}else {
			System.out.println("not a valid email");
		}
		
		// use case 4
		System.out.println("enter your mobile number :");
		String p = sc.nextLine();
		String r = "[0-9]{2}[ ][0-9]{10}";
		Pattern q = Pattern.compile(r);
		Matcher z = q.matcher(p);
		boolean bole = z.matches();
		
		if(z.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		
		System.out.println("enter a password");
		String s = sc.nextLine();
		String rege = "^[A-z]{1}[a-z]{7}[+,&,@,_][0-9]{1}";
		Pattern as = Pattern.compile(rege);
		Matcher ch = as.matcher(s);
		boolean l = ch.matches();
		
		if(ch.matches()) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		
		
	
	}	
}
