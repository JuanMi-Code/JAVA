package tema7REPASO;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class init {
	
	public static void main(String[] args) {

		
		final Pattern pattern = Pattern.compile("[0-9]+[a-zA-Z]", Pattern.CASE_INSENSITIVE);
		final Matcher matcher = pattern.matcher("00000000A");
		System.out.println(matcher.matches());
		
		//final Pattern pattern = Pattern.compile("^\\d*\\.\\d+$", Pattern.CASE_INSENSITIVE);
		//final Matcher matcher = pattern.matcher("00000000A");
		System.out.println(matcher.matches());
		
	}
}
