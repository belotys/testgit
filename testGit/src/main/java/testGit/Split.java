package testGit;

import java.util.regex.Pattern;

public class Split {
	
	public static void main(String[] args) {
		
		String text="a.b.c";
		System.out.println(text.split(Pattern.quote("."))[0]);
	}

}
