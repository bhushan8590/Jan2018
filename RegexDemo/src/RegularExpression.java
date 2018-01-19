import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String str = "Today is date 1/18/2018";
		String email = "email address is bhushan@gmail.com";
		String regex1 = "[0-9]{1,2}[\\W/]|[0-9]{1,2}[\\W/]|[0-9]{2,4}";
		String regex2 = "\\w+@\\w+.\\w+";
		
		Pattern p = Pattern.compile(regex1);
		Matcher m = p.matcher(str);
		while(m.find())
			System.out.print(m.group());
		
		Pattern p1 = Pattern.compile(regex2);
		Matcher m1 = p1.matcher(email);
		while(m1.find())
			System.out.print("\n"+m1.group());

	}

}
