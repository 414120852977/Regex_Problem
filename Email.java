package regexemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		
		String regex = "^[a-z]{3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("abc");
		boolean boo = matcher.matches();
		
		if(matcher.matches()) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		
		// case 2
		
	
	// case 3
	
	String regex2 = "^[a-z]{3}.[a-z]{3}@";
	Pattern pattern2 = Pattern.compile(regex2);
	Matcher matcher2 = pattern2.matcher("abc.xyz@");
	boolean values = matcher2.matches();
	
	if(matcher2.matches()) {
		System.out.println("valid");
	}
	else {
	System.out.println("invalid");
	}
	
	System.out.println((pattern.matches("[a-z]{3}.[a-z]{3}@", "abc.xyz@")));
	System.out.println((Pattern.matches("[a-z]{10}", "bridgelabz")));
	System.out.println((Pattern.matches("[a-z]{10}.[a-z]{2}", "bridgelabz.co")));
	System.out.println((Pattern.matches("[a-z]{10}.[a-z]{2}.[a-z]{2}", "bridgelabz.co.in")));
	System.out.println((Pattern.matches("[a-z]{3}.[a-z]{3}@[a-z]{10}.[a-z]{2}.[a-z]{2}", "abc.xyz@bridgelabz.co.in")));
	
	System.out.println((pattern.matches("[a-z]{3}@[a-z]{5}.[a-z]{3}", "abc@yahoo.com")));
	System.out.println((pattern.matches("[a-z]{3}@[0-9]{1}.[a-z]{3}", "abc@1.com")));


	}

// case 4

	

}
