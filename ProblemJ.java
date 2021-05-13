package problemJ;

import java.util.HashSet;
import java.util.Set;

public class ProblemJ {

	public static void main(String[] args) {
		String perm = "ab";
		Set<String> perString = new HashSet<String>();
		permutation(perm,"",perString);
		for(String word:perString) {
			System.out.println(word);
		}
	}
	public static void permutation(String str,String ans,Set<String> perString) {
		if(str.length()==0) {
			perString.add(ans+"");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i)+str.substring(i+1);
			permutation(ros,ans+ch,perString);
		}
	}

}
